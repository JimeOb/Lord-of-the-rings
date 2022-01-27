package modelo.personaje_builder;
import modelo.equipamientos_factory.PersonajeEquipamientoFactory;
import modelo.personajes.Personaje;

public abstract class PersonajeBuilder {
    protected Personaje personaje1;
    private PersonajeEquipamientoFactory equipamiento;

    public void buildArma(){
        this.personaje1.setArma(equipamiento.createArma());
    };
    public void buildArmadura(){
        this.personaje1.setArmadura(equipamiento.createArmadura());
    };
    public void buildMontura(){
        this.personaje1.setMontura(equipamiento.createMontura());
    };

    public Personaje buildPersonaje(){
        return personaje1;  
    };

    public PersonajeBuilder(PersonajeEquipamientoFactory equipamiento){
        this.equipamiento = equipamiento;
    }
}
