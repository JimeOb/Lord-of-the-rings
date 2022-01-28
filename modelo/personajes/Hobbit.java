package modelo.personajes;

import java.util.Random;


public class Hobbit extends Personaje {
    
    public Hobbit (){
        Random rm = new Random();
        this.altura = rm.nextDouble();
        this.edad = 60 + rm.nextInt(130);
        this.especialidad = "Desarrolladores";
        this.raza = "Hobbit";
        this.rutaImagen = "C:\\Users\\paxpi\\Documents\\NetBeansProjects\\SeñorA\\src\\vistas\\hobbit.jpg";
    }
}
