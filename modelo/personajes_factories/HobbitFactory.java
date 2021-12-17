package modelo.personajes_factories;

import modelo.personajes.Hobbit;
import modelo.personajes.Personaje;

public class HobbitFactory extends PersonajeFactory {
    
    @Override
    public Personaje crearPersonaje() {        
        return new Hobbit();
    }
}
