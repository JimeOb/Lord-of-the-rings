package Modelo.FactoryAbsCreate;

import Modelo.Montura.Montura;

public abstract class MonturaFactory {
    public Montura crearProducto(){
        return factoryMethod();
    }

    public abstract Montura factoryMethod();

}

