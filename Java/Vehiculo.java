public class Vehiculo {
    private String marca;
    private String color;
    private String tipo;
    private String descripcion;

    public Vehiculo(String marca, String color, String tipo, String descripcion){
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", color=" + color + ", tipo=" + tipo + ", descripcion=" + descripcion
                + "]";
    }

    
    
    
}
