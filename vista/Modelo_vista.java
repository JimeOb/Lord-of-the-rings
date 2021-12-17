package vista;

import java.util.List;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.PersonajesManager;
import modelo.TipoPersonaje;
import modelo.personajes.Personaje;


public class Modelo_vista {
    
    private Ventana vista;
    private PersonajesManager managerJuego;

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
            managerJuego.crearPersonajes(TipoPersonaje.Elfo, cantidadPersonajes);
            actualizarListaPersonajes();
            System.out.println("Tamo bien :v");
    }
    
    private void actualizarListaPersonajes() {
        List<Personaje> personajesGenerados = managerJuego.getPersonajes();
        getVista().getBoxGuerreros().setModel(
                new DefaultComboBoxModel (
                        personajesGenerados.stream()
                                .map(personaje -> personaje.getRaza()).collect(Collectors.toList())
                                .toArray()
        ));
        
        //getVista().getBoxGuerreros().up
    }
    
}
