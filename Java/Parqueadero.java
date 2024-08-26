

public class Parqueadero {


    private int id;
    private static int contadorId;
    private String nombre;
    private String area;
    private Cubiculo cubiculo;
    private String direccion;
    private String estado;

    public Parqueadero(String nombre, String area, Cubiculo cubiculo, String direccion, String estado){
        this.id = ++Parqueadero.contadorId;
        this.nombre = nombre;
        this.area = area;
        this.cubiculo = cubiculo;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Cubiculo getCubiculo() {
        return cubiculo;
    }

    public void setCubiculo(Cubiculo cubiculo) {
        this.cubiculo = cubiculo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    


}