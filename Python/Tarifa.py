class Tarifa:
    _id_contador = 0

    def __init__(self, valor, tipo, unidad):
        Tarifa._id_contador+=1
        self.id = Tarifa._id_contador
        self.valor = valor
        self.tipo = tipo
        self.unidad = unidad

    #Metodos Getters
    def get_id(self):
        return self.id
    
    def get_valor(self):
        return self.valor
    
    def get_tipo(self):
        return self.tipo
    
    def get_unidad(self):
        return self.unidad
    
    #Metodos Setters
    def set_valor(self, valor):
        self.valor = valor

    def set_tipo(self, tipo):
        self.tipo=tipo
    
    def set_unidad(self, unidad):
        self.unidad = unidad
