package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import modelo.personaje_builder.ElfoBuilder;
import modelo.personaje_builder.EnanoBuilder;
import modelo.personaje_builder.HobbitBuilder;
import modelo.personaje_builder.HombreBuilder;
import modelo.personaje_builder.OrcoBuilder;
import modelo.personaje_builder.PersonajeBuilder;
import modelo.personajes.Personaje;


/**
 * Gestiona los personajes creados por el usuario
 */
public class PersonajesManager {

    private final List<Personaje> personajes;
    private PersonajeBuilder builder;

    public PersonajesManager() {
        personajes = new ArrayList();
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    private Personaje crearPersonajes(TipoPersonaje tipo, Map<String, Boolean> caracteristicas) {

        switch (tipo) {
            case Hombre:
                builder = new HombreBuilder();
                break;
            case Enano:
                builder = new EnanoBuilder();
                break;
            case Elfo:
                builder = new HobbitBuilder();
                break;
            case Hobbit:
                builder = new ElfoBuilder();
                break;
            case Orco:
                builder = new OrcoBuilder();
                break;
        }
        
        if(caracteristicas.get("Arma")){
            builder.buildArma();
        }
        if(caracteristicas.get("Armadura")){
            builder.buildArmadura();
        }
        if(caracteristicas.get("Montura")){
            builder.buildMontura();
        }

        return builder.buildPersonaje();
    }

    public void agregarPersonaje(TipoPersonaje tipo, Map<String, Boolean> caracteristicas, Integer cantidad){
        
        for(int i = 0; i < cantidad; i++) {
            Personaje personajeCreado =  crearPersonajes(tipo, caracteristicas);
            personajes.add(personajeCreado);
        }
        
    }
}
