package modelo.equipamientos_factory;

import modelo.armaduras.Armadura;
import modelo.armaduras.ArmaduraLigera;
import modelo.armas.Arco;
import modelo.armas.Arma;
import modelo.monturas.Caballo;
import modelo.monturas.Montura;

public class ElfoEquipamientoFactory implements PersonajeEquipamientoFactory {

    @Override
    public Arma createArma() {        
        return new Arco("Común");
    }

    @Override
    public Armadura createArmadura() {        
        return new ArmaduraLigera("Común");
    }

    @Override
    public Montura createMontura() {
        return new Caballo();
    }
    
}
