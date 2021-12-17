package modelo.armaduras;

public abstract class Armadura {
    
    protected String resistencia;
    protected Double peso;
    protected String calidad;
    protected Double defensa;

    public Armadura (String calidad){
        this.calidad = calidad;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }
    
    @Override
    public String toString() {        
        return String.format("info del arma: [Resistencia: %s, peso: %d, calidad: %s, defensa: %d, ]",resistencia , peso, calidad, defensa);
    }  

}
