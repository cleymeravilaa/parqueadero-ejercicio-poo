import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero1 = new Parqueadero("Cuatro Vientos", "Grande", new Cubiculo(30, 100, 200, "Desocupados", "Carro"), "4 vientos", "abierto");

        Horario horario = new Horario("Martes", "6:00 Am", "10:00 PM");
        Guardia guardiaEntrada = new Guardia("10393931", "Patio", "Jose", "Pascal", "Pancracio", "pascalpancracio@gmail.com", "28823828", "../../Parqueadero/images.jpg");
        Guardia guardiaPatio = new Guardia("9293939", "Guardia", "Edgar", "Perez", "Gonzales", "perezgonzales@gmail.com", "3129129291", "../images.jpg");
        Turno turnoP = new Turno(horario, guardiaPatio, parqueadero1, "Guardia Patio", "Cuidar los cubiculos del patio y administrar los vehiculos y usuarios");

        Turno turnoE = new Turno(horario, guardiaEntrada, parqueadero1, "Guardia Entrada", "Supervisa el ingreso de los usuarios de la entrada");
        
        Usuario usuario1 = new Usuario("1992929", "Estudiante", "Cleymer", "Avila", "Pushaina", "avilacleymer@gmail.com",  "../2784403.png", false);
        Vehiculo mercedezBenz = new Vehiculo("Mercedez Benz", "Rojo", "Carro", "Es el ultimo modelo de los que ya no hay");
        Servicio servicio1 = new Servicio(usuario1, mercedezBenz, guardiaEntrada, guardiaPatio, new Date(), new Date(2024, 010, 26, 07, 30));


        
        System.out.println(servicio1.toString());
    }
}
