package modelo.FactoryAbsCreate;

import modelo.montura.Montura;

public abstract class MonturaFactory {
    public Montura crearProducto(){
        return factoryMethod();
    }

    public abstract Montura factoryMethod();

}

