package modelo.FactoryAbsCreate;

import modelo.personajes.Personaje;

public abstract class PersonajeFactory {
    
    public Personaje crearProducto(){
        return factoryMethod();
    }

    public abstract Personaje factoryMethod();
    
}
