package Modelo.Armaduras;

public class ArmaduraLigera extends Armadura {

    public ArmaduraLigera (String calidad){
        super(calidad);
        this.resistencia = "500 golpes";
        this.peso = 60.7;
        this.defensa = 30.0;
    }
}
