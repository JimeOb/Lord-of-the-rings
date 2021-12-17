package vista;

import javax.swing.JOptionPane;


public class Modelo_vista {
    
    private Ventana vista;

    public Ventana getVista() {
        if (vista == null)
            vista = new Ventana(this);
        return vista;
    }
       
    
    public Modelo_vista() {
        
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
            System.out.println("Tamo bien :v");
    }
    
    
}
