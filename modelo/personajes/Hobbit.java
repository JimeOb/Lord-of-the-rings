package modelo.personajes;

import java.util.Random;
import modelo.equipamientos_factory.HobbitEquipamientoFactory;

public class Hobbit extends Personaje {
    
    public Hobbit (){
        super(new HobbitEquipamientoFactory());
        Random rm = new Random();
        this.altura = rm.nextDouble();
        this.edad = 60 + rm.nextInt(130);
        this.especialidad = "Desarrolladores";
        this.raza = "Hobbit";
    }
}
