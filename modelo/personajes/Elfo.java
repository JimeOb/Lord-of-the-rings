package modelo.personajes;

import java.util.Random;

import modelo.equipamientos_factory.ElfoEquipamientoFactory;

public class Elfo extends Personaje {

    public Elfo () {
        super(new ElfoEquipamientoFactory());
        Random rm = new Random();
        this.altura = 2.0 + rm.nextDouble();
        this.edad = 200 + rm.nextInt(400);
        this.especialidad = "Arquero y cazador";
        this.raza = "Elfo";
    }
}
