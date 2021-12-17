package Modelo.Armaduras;

public class ArmaduraPesada extends Armadura{

    public ArmaduraPesada (String calidad){
        super(calidad);
        this.resistencia = "1250 golpes";
        this.peso = 120.5;
        this.defensa = 77.6;
    }
}
