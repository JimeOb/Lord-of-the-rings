package modelo.personajes_factories;

import modelo.personajes.Enano;
import modelo.personajes.Personaje;

public class EnanoFactory extends PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {        
        return new Enano();
    }
    
}
