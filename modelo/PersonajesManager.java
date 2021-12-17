package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.personajes.Personaje;
import modelo.personajes_factories.ElfoFactory;
import modelo.personajes_factories.EnanoFactory;
import modelo.personajes_factories.HombreFactory;
import modelo.personajes_factories.PersonajeFactory;

/**
 * Gestiona los personajes creados por el usuario
 */
public class PersonajesManager {

    private List<Personaje> personajes;
    private PersonajeFactory personajeFactory;

    public PersonajesManager() {
        personajes = new ArrayList<Personaje>();
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void crearPersonajes(TipoPersonaje tipo, Integer cantidad) {

        switch (tipo) {
            case Hombre:
                personajeFactory = new HombreFactory();
                break;
            case Enano:
                personajeFactory = new EnanoFactory();
                break;
            case Elfo:
                personajeFactory = new ElfoFactory();
                break;
        }        

        for(int i = 0; i < cantidad; i++) {
            //TODO cambiar al patron prototype
            Personaje personajeCreado =  personajeFactory.crearPersonaje();
            personajes.add(personajeCreado);
        }
    }    
}
