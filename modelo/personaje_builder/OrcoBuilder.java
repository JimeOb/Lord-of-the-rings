package modelo.personaje_builder;

import modelo.equipamientos_factory.OrcoEquipamientoFactory;
import modelo.personajes.Orco;

public class OrcoBuilder extends PersonajeBuilder {

    public OrcoBuilder(){
        super(new OrcoEquipamientoFactory());
        this.personaje1 = new Orco();
    }
    
}
