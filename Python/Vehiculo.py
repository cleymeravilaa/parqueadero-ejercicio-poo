class Vehiculo:
    def __init__(self, marca, color,  tipo, descripcion):
        self.marca = marca
        self.color = color
        self.tipo = tipo
        self.descripcion = descripcion
    

    # Metodos Getters 
    def get_marca(self):
        return self.marca
    
    def get_color(self):
        return self.color
    
    def get_tipo(self):
        return self.tipo
    
    def get_descripcion(self):
        return self.descripcion
    
    # Metodos Setters

    def set_marca(self,marca):
        self.marca = marca
    
    def set_color(self, color):
        self.color= color

    def set_tipo(self, tipo):
        self.tipo = tipo
    
    def __str__(self):
        return(f"Vehiculo(Marca= '{self.marca}', "
               f"Color='{self.color}', Tipo= '{self.tipo}', "
               f"Descripcion= '{self.descripcion}')")
        
    