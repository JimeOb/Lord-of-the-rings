package vista;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.PersonajesManager;
import modelo.TipoPersonaje;
import modelo.personajes.Personaje;


public class Modelo_vista {
    
    private Ventana vista;
    private final PersonajesManager managerJuego;    

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
        getVista().setSize(290, 460);
        getVista().getPnlGuerreros().setVisible(false);
        getVista().getBoxGuerreros().setVisible(false);        
    }
    
    public void crear (){
        if(Integer.parseInt(vista.getJtxNumero().getText()) > 50 ){
            JOptionPane.showMessageDialog(null,"Solo se puede crear hasta 50 guerreros","Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (Integer.parseInt(vista.getJtxNumero().getText()) < 0){
            JOptionPane.showMessageDialog(null,"Verifique los datos insertados","Error", JOptionPane.ERROR_MESSAGE);
        }
        else
            getVista().setSize(1097, 497);
            getVista().getPnlGuerreros().setVisible(true);
            getVista().getBoxGuerreros().setVisible(true);
            
            Integer cantidadPersonajes = Integer.parseInt(getVista().getJtxNumero().getText());
            String tipo = (String) getVista().getBoxGuerreros1().getSelectedItem();                        
            managerJuego.crearPersonajes(TipoPersonaje.valueOf(tipo), cantidadPersonajes);     
            getVista().getBoxGuerreros().setSelectedIndex(0);
            actualizarListaPersonajes();            
    }
    
    private void cargarImagen(String ruta) {
        try {            
            
            BufferedImage image = ImageIO.read(new File(ruta));
            
            getVista().getLbImagen().setIcon(new ImageIcon(image.getScaledInstance(getVista().getLbImagen().getWidth(), getVista().getLbImagen().getHeight(), Image.SCALE_SMOOTH)));
            
        } catch (IOException ex) {
            
            ex.printStackTrace();            
        }
        
    }
    
    private void actualizarListaPersonajes() {
        List<Personaje> personajesGenerados = managerJuego.getPersonajes();
        
        getVista().getBoxGuerreros().setModel(
                new DefaultComboBoxModel (
                        IntStream
                                .range(0, personajesGenerados.size())
                                .mapToObj(index -> {
                                    return "Guerrero #" + index;
                                })
                                .collect(Collectors.toList())
                                .toArray()                        
        ));        
    }

    void actualizarDatosPanel() {
        List<Personaje> personajesGenerados = managerJuego.getPersonajes();
        Personaje personajeSeleccionado =  personajesGenerados.get(getVista().getBoxGuerreros().getSelectedIndex());
        
        getVista().getJtxEdad().setText(personajeSeleccionado.getEdad().toString());
        getVista().getJtxEspecialidad().setText(personajeSeleccionado.getEspecialidad());
        getVista().getJtxAltura().setText(personajeSeleccionado.getAltura().toString());
        getVista().getJtxArma().setText(personajeSeleccionado.getArma().toString()); 
        getVista().getJtxArnadura().setText(personajeSeleccionado.getArmadura().toString()); 
        getVista().getJtxMontura().setText(personajeSeleccionado.getMontura().toString());         
        
        cargarImagen("vista/img/"+personajeSeleccionado.getClass().getSimpleName() + ".jpg");
        getVista().getLbImagen().repaint();
    }    
}
