package modelo.equipamientos_factory;

import modelo.armaduras.Armadura;
import modelo.armaduras.ArmaduraLigera;
import modelo.armas.Arma;
import modelo.armas.Espada;
import modelo.monturas.Caballo;
import modelo.monturas.Montura;


public class HobbitEquipamientoFactory implements PersonajeEquipamientoFactory {

    @Override
    public Arma createArma() {        
        return new Espada("Comun");
    }

    @Override
    public Armadura createArmadura() {        
        return new ArmaduraLigera("Mala");
    }

    @Override
    public Montura createMontura() {        
        return new Caballo();
    }
}