package modelo.personajes;

import java.util.Random;

import modelo.armaduras.Armadura;
import modelo.armas.Arma;
import modelo.montura.Montura;

public class Hombre extends Personaje {

    public Hombre (Arma arma, Armadura armadura, Montura montura){
        super(arma, armadura, montura);
        Random rm = new Random();
        this.altura = 1.0 + rm.nextDouble();
        this.edad = 20 + rm.nextInt(50);
        this.especialidad = "Caballero";
        this.raza = "Humano";
    }
}
