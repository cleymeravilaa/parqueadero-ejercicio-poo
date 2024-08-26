public class Horario {
    private int id;
    private static int contadorId;
    private String dia;
    private String horaInico;
    private String horaFin;

    public Horario(String dia, String horaInicio, String horaFin){
        this.id = ++Horario.contadorId;
        this.dia = dia;
        this.horaInico= horaInicio;
        this.horaFin = horaFin;
    }


    public int getId(){
        return id;
    }
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraInico() {
        return horaInico;
    }

    public void setHoraInico(String horaInico) {
        this.horaInico = horaInico;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    
}
