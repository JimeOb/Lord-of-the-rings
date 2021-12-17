package Modelo.FactoryAbsCreate;

import Modelo.Armaduras.Armadura;

public abstract class ArmadurasFactory {
    public Armadura crearProducto(){
        return factoryMethod();
    }

    public abstract Armadura factoryMethod();

}
