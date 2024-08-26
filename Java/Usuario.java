public class Usuario {

    private String identificacion;
    private String tipo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private String foto;
    private boolean reserva;

    public Usuario(String identificacion, String tipo, String nom, String ape1, String ape2, String email, String foto, boolean reserva){
        this.identificacion = identificacion;
        this.tipo = tipo;
        this.nombre = nom;
        this.apellido1 = ape1;
        this.apellido2 = ape2;
        this.email = email;
        this.foto = foto;
        this.reserva = reserva;
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


    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Usuario [identificacion=" + identificacion + ", tipo=" + tipo + ", nombre=" + nombre + ", apellido1="
                + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + ", foto=" + foto + ", reserva="
                + reserva + "]";
    }

    
    
}
