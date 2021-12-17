package modelo.personajes;

import java.util.Random;
import modelo.equipamientos_factory.OrcoEquipamientoFactory;

public class Orco extends Personaje {
    
    public Orco (){
        super(new OrcoEquipamientoFactory());
        Random rm = new Random();
        this.altura = 1.2 + rm.nextDouble();
        this.edad = 100 + rm.nextInt(200);
        this.especialidad = "Gerrero";
        this.raza = "Orco";
    }
}
