package modelo.FactoryAbsCreate;

import modelo.armaduras.Armadura;

public abstract class ArmadurasFactory {
    public Armadura crearProducto(){
        return factoryMethod();
    }

    public abstract Armadura factoryMethod();

}
