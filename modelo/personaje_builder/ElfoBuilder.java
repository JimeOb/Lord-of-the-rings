package modelo.personaje_builder;

import modelo.equipamientos_factory.ElfoEquipamientoFactory;
import modelo.personajes.Elfo;

public class ElfoBuilder extends PersonajeBuilder {

    public ElfoBuilder(){
        super(new ElfoEquipamientoFactory());
        this.personaje1 = new Elfo();
    }
}
