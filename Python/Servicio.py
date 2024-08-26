from datetime import datetime

class Servicio:
    def __init__(self, usuario, vehiculo, guardia_entrada, guardia_patio, fecha_entrada, fecha_salida):
        self.usuario = usuario
        self.vehiculo = vehiculo
        self.guardia_entrada = guardia_entrada
        self.guardia_patio = guardia_patio
        self.fecha_entrada = fecha_entrada
        self.fecha_salida = fecha_salida

    # Metodos Getters
    def get_usuario(self):
        return self.usuario
    
    def get_vehiculo(self):
        return self.vehiculo
    
    def get_guardia_entrada(self):
        return self.guardia_entrada
    
    def get_guardia_patio(self):
        return self.guardia_patio
    
    def get_fecha_entrada(self):
        return self.fecha_entrada
    
    def get_fecha_salida(self):
        return self.fecha_salida
    

    # Metodos Setters
    def set_usuario(self, usuario):
        self.usuario = usuario

    def set_vehiculo(self, vehiculo):
        self.vehiculo = vehiculo

    def set_guardia_entrada(self, guardia_entrada):
        self.guardia_entrada = guardia_entrada

    def set_guardia_patio(self, guardia_patio):
        self.guardia_patio = guardia_patio
    
    def set_fecha_entrada(self, fecha_entrada):
        self.fecha_entrada = fecha_entrada
    
    def set_fecha_salida(self, fecha_salida):
        self.fecha_salida = fecha_salida
    

    def __str__(self):
        return (f"Servicio(Usuario= '{self.usuario.__str__()}', "
                f"Vehiculo='{self.vehiculo.__str__()}', Guardia Entrada = '{self.guardia_entrada.__str__()}', "
                f"Guardia Patio = '{self.guardia_patio.__str__()}', Fecha Entrada = '{self.fecha_entrada}', "
                f"Fecha Salida = '{self.fecha_salida}')")
        