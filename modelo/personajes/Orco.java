package modelo.personajes;

import java.util.Random;


public class Orco extends Personaje {
    
    public Orco (){
        Random rm = new Random();
        this.altura = 1.2 + rm.nextDouble();
        this.edad = 100 + rm.nextInt(200);
        this.especialidad = "Guerrero";
        this.raza = "Orco";
        this.rutaImagen = "C:\\Users\\paxpi\\Documents\\NetBeansProjects\\SeñorA\\src\\vistas\\orco.jpg";
    }
}
