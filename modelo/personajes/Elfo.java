package modelo.personajes;

import java.util.Random;

public class Elfo extends Personaje {

    public Elfo () {
        Random rm = new Random();
        this.altura = 2.0 + rm.nextDouble();
        this.edad = 200 + rm.nextInt(400);
        this.especialidad = "Arquero y cazador";
        this.raza = "Elfo";
        this.rutaImagen = "C:\\Users\\paxpi\\Documents\\NetBeansProjects\\SeñorA\\src\\vistas\\elfo.jpg";
    }
}
