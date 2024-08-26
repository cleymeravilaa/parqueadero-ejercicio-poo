public class Cubiculo {
    private static int contadorId;
    private int id;
    private int cantidad;
    private double ancho;
    private double largo;
    private String estado;
    private String tipo;

    public Cubiculo(int cantidad, double ancho, double largo, String estado, String tipo) {
        this.id = ++Cubiculo.contadorId;
        this.cantidad = cantidad;
        this.ancho = ancho;
        this.largo= largo;
        this.estado = estado;
        this.tipo = tipo;

    }


    public int getId(){
        return this.id;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    



    
    

}
