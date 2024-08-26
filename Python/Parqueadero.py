class Parqueadero:

    _id_contador = 0

    def __init__(self, nombre, area, cubiculo, direccion, estado):
        Parqueadero._id_contador+=1
        self.id = Parqueadero._id_contador
        self.nombre = nombre
        self.area = area
        self.cubiculo = cubiculo
        self.direccion = direccion
        self.estado = estado


    #Getters
    def get_id(self):
        return self.id
    
    def get_nombre(self):
        return self.nombre

    def  get_area(self):
        return self.area

    def get_cubiculo(self):
        return self.cubiculo
 
    def get_direccion(self):
        return self.direccion

    def get_estado(self):
        return self.estado

    # Setters

    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def set_area(self, area):
        self.area = area

    def set_cubiculo(self, cubiculo):
        self.cubiculo = cubiculo
    
    def set_direccion(self, direccion):
        self.direccion = direccion

    def set_estado(self, estado):
        self.estado = estado

       