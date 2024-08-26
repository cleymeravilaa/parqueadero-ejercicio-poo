class Guardia:

    def __init__(self, identificacion, tipo, nombre, apellido1 , apellido2, email, telefono, foto):
        self.identificacion = identificacion
        self.tipo = tipo
        self.nombre = nombre
        self.apellido1 = apellido1
        self.apellido2 = apellido2
        self.email = email
        self.telefono = telefono
        self.foto= foto

    # Metodos Getters
    def get_identificacion(self):
        return self.identificacion
    
    def get_tipo(self):
        return self.tipo
    
    def get_nombre(self):
        return self.nombre
    
    def get_apellido1(self):
        return self.apellido1
    
    def get_apellido2(self):
        return self.apellido2
    
    def get_email(self):
        return self.email
    
    def get_telefono(self):
        return self.telefono
    
    def get_foto(self):
        return self.foto
    

    # Metodos Setters

    def set_identificacion(self, identificacion):
        self.identificacion = identificacion
    
    def set_tipo(self, tipo):
        self.tipo = tipo
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def set_apellido1(self, apellido1):
        self.apellido1 = apellido1
    
    def set_apellido2(self, apellido2):
        self.apellido2 = apellido2
    
    def set_email(self, email):
        self.email = email
    
    def set_telefono(self, telefono):
        self.telefono = telefono
    
    def set_foto(self, foto):
        self.foto = foto

    def __str__(self):
        return (f"Usuario(identificacion={self.identificacion}, Tipo ={self.tipo}, "
                f"nombre='{self.nombre}', Apellido 1='{self.apellido1}', "
                f"Apellido 2= '{self.apellido2}', Email = '{self.email}', "
                f"Telefono ={self.telefono}, Foto='{self.foto}')")