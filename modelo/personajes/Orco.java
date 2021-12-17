package modelo.personajes;

import java.util.Random;

import modelo.armaduras.Armadura;
import modelo.armas.Arma;
import modelo.montura.Montura;

public class Orco extends Personaje {
    
    public Orco (Arma arma, Armadura armadura, Montura montura){
        super(arma, armadura, montura);
        Random rm = new Random();
        this.altura = 1.2 + rm.nextDouble();
        this.edad = 100 + rm.nextInt(200);
        this.especialidad = "Gerrero";
        this.raza = "Orco";
    }
}
