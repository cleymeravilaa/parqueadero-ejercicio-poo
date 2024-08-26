public class Tarifa {
    private int id;
    private static int contadorId;
    private double valor;
    private String tipo;
    private int unidad;

    public Tarifa(double valor, String tipo, int unidad) {
        this.id = ++Tarifa.contadorId;
        this.valor = valor;
        this.tipo = tipo;
        this.unidad = unidad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static int getContadorId() {
        return contadorId;
    }
    public static void setContadorId(int contadorId) {
        Tarifa.contadorId = contadorId;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getUnidad() {
        return unidad;
    }
    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    

    
}
