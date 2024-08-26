
public class Guardia {
    private String identificacion;
    private String tipo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private String telefono;
    private String foto;

    public Guardia(String identificacion, String tipo, String nombre, String apellido1, String apellido2, String email, String telefono, String foto){
        this.identificacion = identificacion;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.telefono=telefono;
        this.foto = foto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Guardia [identificacion=" + identificacion + ", tipo=" + tipo + ", nombre=" + nombre + ", apellido1="
                + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + ", telefono=" + telefono + ", foto="
                + foto + "]";
    }

    
    
}
