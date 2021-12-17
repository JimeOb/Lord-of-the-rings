package modelo.personajes;

import modelo.armaduras.Armadura;
import modelo.armas.Arma;
import modelo.equipamientos_factory.PersonajeEquipamientoFactory;
import modelo.monturas.Montura;

public abstract class Personaje implements Cloneable {
    
    protected String raza;
    protected Arma arma;
    protected Armadura armadura;
    protected Montura montura;
    protected String especialidad;
    protected Integer edad;
    protected Double altura;
    
    protected PersonajeEquipamientoFactory equipamientoFactory;

    public Personaje(PersonajeEquipamientoFactory equipamientoFactory) {
        this.equipamientoFactory = equipamientoFactory;
        armadura = equipamientoFactory.createArmadura();
        arma = equipamientoFactory.createArma();
        montura = equipamientoFactory.createMontura();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {        
        return String.format("info del arma: [Raza: %s, arma: " + arma.toString() +", armadura: "+ armadura.toString() +", montura: "+ montura.toString() +", especialidad: %s, edad: %i, altura: %d]", raza, especialidad, edad, altura);
    }  




    @Override
    protected Personaje clone() {
        Personaje clonedPersonaje = null;
        try {
            clonedPersonaje = (Personaje) super.clone();
            
            
            return clonedPersonaje;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }   
        return clonedPersonaje;
    } 
}
