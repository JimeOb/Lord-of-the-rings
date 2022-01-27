package modelo.personajes;

import java.util.Random;


public class Hombre extends Personaje {

    public Hombre (){
        Random rm = new Random();
        this.altura = 1.0 + rm.nextDouble();
        this.edad = 20 + rm.nextInt(50);
        this.especialidad = "Caballero";
        this.raza = "Humano";
    }
}
