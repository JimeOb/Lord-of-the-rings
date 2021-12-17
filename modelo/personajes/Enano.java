package modelo.personajes;

import java.util.Random;

import modelo.armaduras.Armadura;
import modelo.armas.Arma;
import modelo.montura.Montura;

public class Enano extends Personaje {
    
    public Enano (Arma arma, Armadura armadura, Montura montura){
        super(arma, armadura, montura);
        Random rm = new Random();
        this.altura = 0.5 + rm.nextDouble();
        this.edad = 100 + rm.nextInt(300);
        this.especialidad = "Guerrero y herrero";
        this.raza = "Enano";
    }
}
