class Horario:
    _id_contador = 0

    def __init__(self, dia, hora_inicio, hora_fin):
        Horario._id_contador+=1
        self.id = Horario._id_contador
        self.dia = dia
        self.hora_inico = hora_inicio
        self.hora_fin = hora_fin

    # Getters
    def get_id(self):
        return self.id
    
    def get_dia(self):
        return self.dia

    def get_hora_inico(self):
        return self.hora_inico
    
    def get_hora_fin(self):
        return self.hora_fin
    
    # Setters
    def set_dia(self, dia):
        self.dia = dia

    def set_hora_inicio(self, hora_inicio):
        self.hora_inico = hora_inicio

    def set_hora_fin(self, hora_fin):
        self.hora_fin = hora_fin