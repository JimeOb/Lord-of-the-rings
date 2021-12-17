package modelo.equipamientos_factory;

import modelo.armaduras.Armadura;
import modelo.armaduras.ArmaduraPesada;
import modelo.armas.Arma;
import modelo.armas.Hacha;
import modelo.monturas.Bestia;
import modelo.monturas.Montura;

public class OrcoEquipamientoFactory implements PersonajeEquipamientoFactory {

    @Override
    public Arma createArma() {        
        return new Hacha("Poco comun");
    }

    @Override
    public Armadura createArmadura() {        
        return new ArmaduraPesada("Superior");
    }

    @Override
    public Montura createMontura() {        
        return new Bestia();
    }
    
}
