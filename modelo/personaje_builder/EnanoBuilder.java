package modelo.personaje_builder;

import modelo.equipamientos_factory.EnanoEquipamientoFactory;
import modelo.personajes.Enano;

public class EnanoBuilder extends PersonajeBuilder {

    public EnanoBuilder(){
        super(new EnanoEquipamientoFactory());
        this.personaje1 = new Enano();
    }
    
}
