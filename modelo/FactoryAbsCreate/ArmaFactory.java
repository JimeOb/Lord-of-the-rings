package modelo.FactoryAbsCreate;

import modelo.armas.Arma;

public abstract class ArmaFactory {
    public Arma crearProducto(){
        return factoryMethod();
    }

    public abstract Arma factoryMethod();

}
