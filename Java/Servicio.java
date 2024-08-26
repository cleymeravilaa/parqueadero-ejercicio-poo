import java.util.Date;

public class Servicio {
    private int id;
    private static int contadorId;
    private Date fechaEntrada;
    private Date fechaSalida;
    private Usuario conductor;
    private Vehiculo vehiculo;
    private Guardia guardiaEntrada;
    private Guardia guardiaPatio;

    public Servicio(Usuario usuario, Vehiculo vehiculo, Guardia guardiaEntrada, Guardia guardiaPatio, Date fechaEntrada, Date fechaSalida){
        this.id = ++Servicio.contadorId;
        this.conductor = usuario;
        this.vehiculo = vehiculo;
        this.guardiaEntrada = guardiaEntrada;
        this.guardiaPatio = guardiaPatio;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int getId() {
        return id;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Servicio.contadorId = contadorId;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Usuario getConductor() {
        return conductor;
    }

    public void setConductor(Usuario conductor) {
        this.conductor = conductor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Guardia getGuardiaEntrada() {
        return guardiaEntrada;
    }

    public void setGuardiaEntrada(Guardia guardiaEntrada) {
        this.guardiaEntrada = guardiaEntrada;
    }

    public Guardia getGuardiaPatio() {
        return guardiaPatio;
    }

    public void setGuardiaPatio(Guardia guardiaPatio) {
        this.guardiaPatio = guardiaPatio;
    }

    @Override
    public String toString() {
        return "Servicio [id=" + this.getId() + ", fechaEntrada=" + this.getFechaEntrada() + ", fechaSalida=" + this.getFechaSalida() + ", conductor="
                + this.getConductor() + ", vehiculo=" + this.getVehiculo() + ", guardiaEntrada=" + this.getGuardiaEntrada() + ", guardiaPatio="
                + this.getGuardiaPatio() + "]";
    }

    
}
