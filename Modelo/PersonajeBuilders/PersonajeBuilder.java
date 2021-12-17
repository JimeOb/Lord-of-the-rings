package Modelo.PersonajeBuilders;

import Modelo.Personajes.Personaje;

public abstract class PersonajeBuilder {
    
    protected Personaje personaje;
    
    public Personaje getPersonaje() {
        return personaje;
    }
    
    public abstract void buildArma();
    public abstract void buildArmadura();
    public abstract void buildMontura();
    
    
    
}
