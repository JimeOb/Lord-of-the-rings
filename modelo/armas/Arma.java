package modelo.armas;

public abstract class Arma {
    
    protected Double peso;
    protected Double ataque;
    protected String rareza;

    public Arma(String rareza) {
        this.rareza = rareza;
    }    
    
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }
}
