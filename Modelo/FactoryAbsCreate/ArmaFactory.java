package Modelo.FactoryAbsCreate;

import Modelo.Armas.Arma;

public abstract class ArmaFactory {
    public Arma crearProducto(){
        return factoryMethod();
    }

    public abstract Arma factoryMethod();

}
