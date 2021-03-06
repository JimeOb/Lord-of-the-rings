package modelo.equipamientos_factory;

import modelo.armaduras.Armadura;
import modelo.armas.Arma;
import modelo.monturas.Montura;

public interface PersonajeEquipamientoFactory {
    
    public Arma createArma();
    public Armadura createArmadura();
    public Montura createMontura();
    
}
