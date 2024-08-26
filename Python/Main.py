from Parqueadero import Parqueadero
from Cubiculo import Cubiculo
from Horario import Horario
from Guardia import Guardia
from Turno import Turno
from Usuario import Usuario
from Vehiculo import Vehiculo
from Servicio import Servicio
from datetime import datetime, date

class Main:

        
    cubiculo = Cubiculo(20,100,300, "desocupados", "carro")

    parqueadero_1 = Parqueadero("cuatro vientos", "grande", cubiculo , "Cuatro vientos", "abierto")

    horario = Horario("martes", "6:00AM", "10:00PM")
    guardia_entrada = Guardia("10393931", "Patio", "Jose", "Pascal", "Pancracio", "pascalpancracio@gmail.com", "28823828", "../../Parqueadero/images.jpg") 
    guardia_patio = Guardia("9293939", "Guardia", "Edgar", "Perez", "Gonzales", "perezgonzales@gmail.com", "3129129291", "../images.jpg")

    turnoP = Turno(horario, guardia_patio, parqueadero_1, "Guardia Patio", "Cuidar los cubiculos del patio y administrar los vehiculos y usuarios")

    turno_e = Turno(horario, guardia_entrada, parqueadero_1, "Guardia Entrada", "Supervisa el ingreso de los usuarios de la entrada")

    usuario_1 = Usuario("1992929", "Estudiante", "Cleymer", "Avila", "Pushaina", "avilacleymer@gmail.com",  "../2784403.png", False)

    mercedez_benz = Vehiculo("Mercedez Benz", "Rojo", "Carro", "Es el ultimo modelo de los que ya no hay")

    servicio_1 = Servicio(usuario_1, mercedez_benz, guardia_entrada, guardia_patio, datetime.now(), datetime(2024, 8, 25, 7, 30, 20))

    print(servicio_1)

        





