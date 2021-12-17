package modelo.monturas;

public abstract class Montura {
    
    protected Double velocidad;
    protected Integer edad;
    protected String size;

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {        
        return String.format("info del arma: [Velocidad: %f, edad: %d, tamaño: %s]", velocidad, edad, size);
    }  
}
