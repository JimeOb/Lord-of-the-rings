package modelo.personajes;

import java.util.Random;

import modelo.armaduras.Armadura;
import modelo.armas.Arma;
import modelo.equipamientos_factory.PersonajeEquipamientoFactory;
import modelo.montura.Montura;

public class Hobbit extends Personaje {
    
    public Hobbit (){
        super(null);
        Random rm = new Random();
        this.altura = rm.nextDouble();
        this.edad = 60 + rm.nextInt(130);
        this.especialidad = "Desarrolladores";
        this.raza = "Hobbit";
    }
}
