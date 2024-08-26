class Usuario:

    def __init__(self, identificacion, tipo, nombre, apellido1, apellido2, email, foto, reserva):
        self.nombre = nombre
        self.identificacion = identificacion
        self.tipo = tipo
        self.apellido1 = apellido1
        self.apellido2 = apellido2
        self.email = email
        self.foto = foto
        self.reserva = reserva

    # Metodos geters

    def get_identificacion(self):
        return self.identificacion
    
    def get_nombre(self):
        return self.nombre
    
    def get_tipo(self):
        return self.tipo
    
    def get_apellido1(self):
        return self.apellido1
    
    def get_apellido2(self):
        return self.apellido2
    
    def get_email(self):
        return self.email
    
    def get_rol(self):
        return self.rol
    
    def get_foto(self):
        return self.foto
    
    def get_reserva(self):
        return self.reserva

    # Metodos Setters
    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_identificacion(self, identificacion):
        self.identificacion = identificacion

    def set_tipo(self, tipo):
        self.tipo = tipo

    def set_apellido1(self, apellido1):
        self.apellido1 = apellido1

    def set_apellido2(self, apellido2):
        self.apellido2 = apellido2
    
    def set_email(self, email):
        self.email = email

    def set_rol(self, rol):
        self.rol = rol
    
    def set_foto(self, foto):
        self.foto= foto

    def set_reserva(self, reserva):
        self.reserva = reserva

    
    def __str__(self):
        return (f"Usuario(identificacion={self.identificacion}, Tipo ={self.tipo}, "
                f"nombre='{self.nombre}', Apellido 1='{self.apellido1}', "
                f"Apellido 2= '{self.apellido2}', Email = '{self.email}', "
                f"Foto='{self.foto}', "
                f"Reserva='{self.reserva}')")