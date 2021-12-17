package Modelo.Personajes;

import java.util.Random;

import Modelo.Armaduras.Armadura;
import Modelo.Armas.Arma;
import Modelo.Montura.Montura;

public class Elfo extends Personaje {

    public Elfo (Arma arma, Armadura armadura, Montura montura){
        super(arma, armadura, montura);
        Random rm = new Random();
        this.altura = 2.0 + rm.nextDouble();
        this.edad = 200 + rm.nextInt(400);
        this.especialidad = "Arquero y cazador";
        this.raza = "Elfo";
    }
}
