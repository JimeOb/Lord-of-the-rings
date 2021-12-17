package Modelo.Personajes;

import java.util.Random;

import Modelo.Armaduras.Armadura;
import Modelo.Armas.Arma;
import Modelo.Montura.Montura;

public class Hobbit extends Personaje {
    
    public Hobbit (Arma arma, Armadura armadura, Montura montura){
        super(arma, armadura, montura);
        Random rm = new Random();
        this.altura = rm.nextDouble();
        this.edad = 60 + rm.nextInt(130);
        this.especialidad = "Desarrolladores";
        this.raza = "Hobbit";
    }
}
