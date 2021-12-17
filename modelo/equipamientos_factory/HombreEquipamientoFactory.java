package modelo.equipamientos_factory;

import modelo.armaduras.Armadura;
import modelo.armaduras.ArmaduraPesada;
import modelo.armas.Arma;
import modelo.armas.Espada;
import modelo.montura.Caballo;
import modelo.montura.Montura;

public class HombreEquipamientoFactory implements PersonajeEquipamientoFactory {

    @Override
    public Arma createArma() {        
        return new Espada("Poco comun");
    }

    @Override
    public Armadura createArmadura() {        
        return new ArmaduraPesada("Superior");
    }

    @Override
    public Montura createMontura() {        
        return new Caballo();
    }
    
}
