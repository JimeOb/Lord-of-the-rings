package vista;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.PersonajesManager;
import modelo.TipoPersonaje;
import modelo.personajes.Personaje;

public class Modelo_vista {
    
    private Ventana vista;
    private final PersonajesManager managerJuego;    
    private TipoPersonaje persona;
    
    public Ventana getVista() {
        if (vista == null)
            vista = new Ventana(this);
        return vista;
    }
    
    public Modelo_vista() {
        managerJuego = new PersonajesManager();
    }
    
    public void iniciar (){
        getVista().setVisible(true);
        getVista().setSize(494, 526);
        getVista().getPnlGuerreros().setVisible(false);          
        
    }

    
    public void imagenes (){
        
        int indice = getVista().getJpnImagenes().getComponentCount();
        
        GridLayout layout = (GridLayout) getVista().getJpnImagenes().getLayout();
        
        for (int i = indice; i < managerJuego.getPersonajes().size(); i++){
            JLabel nuevo = new JLabel();
            nuevo.setIcon(cargarImagen(managerJuego.getPersonajes().get(i).getRutaImagen()));
            getVista().getJpnImagenes().add(nuevo);
        }
        
        layout.setRows((int) Math.ceil((double) managerJuego.getPersonajes().size() / 4));
    }
    
    
    
    public void crear (){
        if(Integer.parseInt(vista.getJtxNumero().getText()) > 50 ){
            JOptionPane.showMessageDialog(null,"Solo se puede crear hasta 50 guerreros","Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (Integer.parseInt(vista.getJtxNumero().getText()) < 0){
            JOptionPane.showMessageDialog(null,"Verifique los datos insertados","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
            getVista().setSize(1726, 823);                
        
            Map<String, Boolean> mapa = new HashMap<>();
                  
            mapa.put("Armadura", getVista().getRbtnArmadura().isSelected());
            mapa.put("Montura", getVista().getRbtnMontura().isSelected());
            mapa.put("Arma",getVista().getRbtnArma().isSelected());
            
            Integer cantidadPersonajes = Integer.parseInt(getVista().getJtxNumero().getText());
            String tipo = (String) getVista().getBoxGuerreros1().getSelectedItem();                        
            managerJuego.agregarPersonaje(Enum.valueOf(TipoPersonaje.class, tipo), mapa , cantidadPersonajes);
            getVista().getBoxGuerreros().setSelectedIndex(0);
            actualizarListaPersonajes();     
            imagenes();
            
            cambiarCard("info");
    
    }
    
    private Icon cargarImagen(String ruta){
        try {
            BufferedImage image = ImageIO.read(new File(ruta));
            return new ImageIcon(image.getScaledInstance(getVista().getLbImagen().getWidth(), getVista().getLbImagen().getHeight(), Image.SCALE_SMOOTH));
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }    
    private void ActualizarImagenPj(String ruta) {
                 
        getVista().getLbImagen().setIcon(cargarImagen(ruta));        
        
    }
    
    private void actualizarListaPersonajes() {
        List<Personaje> personajesGenerados = managerJuego.getPersonajes();
        
        getVista().getBoxGuerreros().setModel(
                new DefaultComboBoxModel (
                        IntStream
                                .range(0, personajesGenerados.size())
                                .mapToObj(index -> {
                                    int val = index+1;
                                    return "Guerrero #"  + val;
                                })
                                .collect(Collectors.toList())
                                .toArray()                        
        ));        
    }

    public void actualizarDatosPanel() {
        List<Personaje> personajesGenerados = managerJuego.getPersonajes();
        Personaje personajeSeleccionado =  personajesGenerados.get(getVista().getBoxGuerreros().getSelectedIndex());
        
        getVista().getJtxEdad().setText(personajeSeleccionado.getEdad().toString());
        getVista().getJtxEspecialidad().setText(personajeSeleccionado.getEspecialidad());
        getVista().getJtxAltura().setText(personajeSeleccionado.getAltura().toString());
        getVista().getJtxRaza().setText(personajeSeleccionado.getRaza());
        
        if(personajeSeleccionado.getArma()!= null){
            cargarDatosArma(personajeSeleccionado);
            getVista().getPnlArma().setVisible(true);
        } else {
            getVista().getPnlArma().setVisible(false);
        }
        if(personajeSeleccionado.getArmadura()!= null){
            cargarDatosArmadura(personajeSeleccionado);
            getVista().getPnlArmadura().setVisible(true);
        } else {
            getVista().getPnlArmadura().setVisible(false);
        }
        
        if(personajeSeleccionado.getMontura()!= null){
            cargarDatosMontura(personajeSeleccionado);
            getVista().getPnlMontura().setVisible(true);
        } else {
            getVista().getPnlMontura().setVisible(false);
        }
 
        ActualizarImagenPj(personajeSeleccionado.getRutaImagen());
        getVista().getLbImagen().repaint();        
    }    
    
    private void cargarDatosArma(Personaje pjSeleccionado) {
        
        getVista().getTxtAtaqueArma().setText(pjSeleccionado.getArma().getAtaque().toString());
        getVista().getTxtRarezaArma().setText(pjSeleccionado.getArma().getRareza());
        getVista().getTxtPesoArma().setText(pjSeleccionado.getArma().getPeso().toString());        
        
    }
    
    private void cargarDatosArmadura(Personaje pjSeleccionado) {
        
        getVista().getTxtCalidadArm().setText(pjSeleccionado.getArmadura().getCalidad());
        getVista().getTxtDefensaArm().setText(pjSeleccionado.getArmadura().getDefensa().toString());
        getVista().getTxtPesoArm().setText(pjSeleccionado.getArmadura().getPeso().toString());
        getVista().getTxtResistenciaArm().setText(pjSeleccionado.getArmadura().getResistencia());
        
    }
    
    private void cargarDatosMontura(Personaje pjSeleccionado) {
        
        getVista().getTxtEdadMont().setText(pjSeleccionado.getMontura().getEdad().toString());
        getVista().getTxtSizeMont().setText(pjSeleccionado.getMontura().getSize());
        getVista().getTxtVelocidadMont().setText(pjSeleccionado.getMontura().getVelocidad().toString()); 
        
    }

    public void cambiarCard(String card) {
        CardLayout layout = (CardLayout) getVista().getPnlInfo().getLayout();
        layout.show(getVista().getPnlInfo(), card);
        
        if(card.equals("crear"))
            getVista().setSize(494, 526);
    }
}
