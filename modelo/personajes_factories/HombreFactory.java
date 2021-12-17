package modelo.personajes_factories;

import modelo.personajes.Hombre;
import modelo.personajes.Personaje;

public class HombreFactory extends PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {
        return new Hombre();
    }
    
}
