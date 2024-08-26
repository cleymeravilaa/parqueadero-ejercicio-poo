public class Turno {
    private int id;
    private static int contadorId;
    private Horario horario;
    private Guardia guardia;
    private Parqueadero parqueadero;
    private String cargo;
    private String observacion;

    public Turno(Horario horario, Guardia guardia, Parqueadero parqueadero, String cargo, String observacion ){
        this.id = ++Turno.contadorId;
        this.horario = horario;
        this.guardia = guardia;
        this.parqueadero = parqueadero; 
        this.cargo = cargo;
        this.observacion = observacion;
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
        Turno.contadorId = contadorId;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Guardia getGuardia() {
        return guardia;
    }

    public void setGuardia(Guardia guardia) {
        this.guardia = guardia;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    
}

