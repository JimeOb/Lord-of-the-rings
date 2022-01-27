package modelo.personaje_builder;

import modelo.equipamientos_factory.HobbitEquipamientoFactory;
import modelo.personajes.Hobbit;

public class HobbitBuilder extends PersonajeBuilder {

    public HobbitBuilder(){
        super(new HobbitEquipamientoFactory());
        this.personaje1 = new Hobbit();
    }
    
}
