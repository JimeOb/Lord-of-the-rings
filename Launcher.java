
import Vista.Modelo_vista;

public class Launcher {
   
    private Modelo_vista App;

    public Launcher() {
        App = new Modelo_vista();
        App.iniciar();
    }
    
    public static void main(String[] args) {
        new Launcher();
}
    
}
