package modelo.personajes;

import modelo.armaduras.Armadura;
import modelo.armas.Arma;
import modelo.montura.Montura;

public abstract class Personaje implements Cloneable {
    
    protected String raza;
    protected Arma arma;
    protected Armadura armadura;
    protected Montura montura;
    protected String especialidad;
    protected Integer edad;
    protected Double altura;
    
    public Personaje(Arma arma, Armadura armadura, Montura montura){
        this.arma = arma;
        this.armadura = armadura;
        this.montura = montura;
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
    protected Personaje clone() {
        Personaje clonedPersonaje = null;
        try {
            clonedPersonaje = (Personaje) super.clone();
            //TODO cambiar propiedades   
            
            return clonedPersonaje;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }   
        return clonedPersonaje;
    } 
}
