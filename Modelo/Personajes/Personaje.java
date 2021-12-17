package Modelo.Personajes;

import Modelo.Armaduras.Armadura;
import Modelo.Armas.Arma;
import Modelo.Monturas.Montura;

public abstract class Personaje implements Cloneable {
    
    private String raza;
    private Arma arma;
    private Armadura armadura;
    private Montura montura;
    private String especialidad;
    private String Sexo;
    private Integer edad;
    private Double altura;
    

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

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
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
