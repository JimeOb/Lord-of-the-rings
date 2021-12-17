package Modelo.FactoryAbsCreate;

import Modelo.Personajes.Personaje;

public abstract class PersonajeFactory {
    
    public Personaje crearProducto(){
        return factoryMethod();
    }

    public abstract Personaje factoryMethod();
    
}
