package modelo.personajes_factories;

import modelo.personajes.Elfo;
import modelo.personajes.Personaje;

public class ElfoFactory extends PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {
        return new Elfo();
    }
    
}
