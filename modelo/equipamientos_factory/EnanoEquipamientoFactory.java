package modelo.equipamientos_factory;

import modelo.armaduras.Armadura;
import modelo.armaduras.ArmaduraPesada;
import modelo.armas.Arma;
import modelo.armas.Hacha;
import modelo.monturas.Caballo;
import modelo.monturas.Montura;

public class EnanoEquipamientoFactory implements PersonajeEquipamientoFactory {

    @Override
    public Arma createArma() {        
        return new Hacha("");
    }

    @Override
    public Armadura createArmadura() {        
        return new ArmaduraPesada("");
    }

    @Override
    public Montura createMontura() {        
        //TODO agregar una montura adecuada para el enano
        return new Caballo();
    }
    
}
