class Cubiculo:
    _id_contador = 0
    
    def __init__(self, cantidad, ancho, largo, estado, tipo):
        Cubiculo._id_contador+=1
        self.id = Cubiculo._id_contador
        self.cantidad = cantidad
        self.ancho = ancho
        self.largo = largo
        self.estado = estado
        self.tipo = tipo

    # Metodos Getters
    def get_id(self):
        return self.id
    
    def get_cantidad(self):
        return self.cantidad

    def  get_ancho(self):
        return self.ancho

    def get_largo(self):
        return self.largo
 
    def get_estado(self):
        return self.estado
    
    # Metodos Setters
    def set_cantidad(self, cantidad):
        self.cantidad = cantidad
    
    def set_ancho(self, ancho):
        self.ancho = ancho

    def set_largo(self, largo):
        self.largo = largo
    
    def set_estado(self, estado):
        self.estado = estado
    
    def __str__(self):
        return (f"Parqueadero(id={self.id}, "
                f"nombre='{self.nombre}', area='{self.area}', "
                f"cubiculo='{self.cubiculo}', direccion='{self.direccion}', "
                f"estado='{self.estado}')")
        
    
    
    