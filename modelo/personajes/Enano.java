package modelo.personajes;

import java.util.Random;


public class Enano extends Personaje {
    
    public Enano (){
        Random rm = new Random();
        this.altura = 0.5 + rm.nextDouble();
        this.edad = 100 + rm.nextInt(300);
        this.especialidad = "Guerrero y herrero";
        this.raza = "Enano";
    }
}
