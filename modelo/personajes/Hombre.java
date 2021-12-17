package modelo.personajes;

import java.util.Random;
import modelo.equipamientos_factory.HombreEquipamientoFactory;

public class Hombre extends Personaje {

    public Hombre (){
        super(new HombreEquipamientoFactory());
        Random rm = new Random();
        this.altura = 1.0 + rm.nextDouble();
        this.edad = 20 + rm.nextInt(50);
        this.especialidad = "Caballero";
        this.raza = "Humano";
    }
}
