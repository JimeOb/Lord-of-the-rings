package modelo.personajes;

import modelo.armaduras.Armadura;
import modelo.armas.Arma;

import modelo.monturas.Montura;

public abstract class Personaje implements Cloneable {
    
    protected String raza;
    protected Arma arma;
    protected Armadura armadura;
    protected Montura montura;
    protected String especialidad;
    protected Integer edad;
    protected Double altura;
    protected String rutaImagen;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Montura getMontura() {
        return montura;
    }

    public void setMontura(Montura montura) {
        this.montura = montura;
    }

    public String getRutaImagen() {
        return rutaImagen;
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
        
            
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }   
        return clonedPersonaje;
    } 
}
