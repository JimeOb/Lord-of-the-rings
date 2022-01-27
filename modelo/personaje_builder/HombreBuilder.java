package modelo.personaje_builder;

import modelo.equipamientos_factory.HombreEquipamientoFactory;
import modelo.personajes.Hombre;

public class HombreBuilder extends PersonajeBuilder {

    public HombreBuilder(){
        super(new HombreEquipamientoFactory());
        this.personaje1 = new Hombre();
    }
    
}
