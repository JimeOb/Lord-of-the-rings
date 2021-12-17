package modelo.personajes_factories;

import modelo.personajes.Orco;
import modelo.personajes.Personaje;

public class OrcoFactory  extends PersonajeFactory{

    @Override
    public Personaje crearPersonaje() {        
        return new Orco();
    }
    
}
