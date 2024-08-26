class Turno:

    _id_contador = 0
    
    def __init__(self, horario, guardia, parqueadero,cargo, observacion):
        Turno._id_contador+=1
        self.id = Turno._id_contador
        self.horario = horario
        self.guardia = guardia
        self.parqueadero=parqueadero
        self.cargo = cargo
        self.observacion = observacion

    def get_id(self):
        return self.id
    
    def get_horario(self):
        return self.horario
    
    def get_guardia(self):
        return self.horario
    
    def get_parqueadero(self):
        return self.parqueadero
    
    def get_cargo(self):
        return self.cargo
    
    def get_observacion(self):
        return self.observacion
    
    def set_horario(self, horario):
        self.horario = horario

    def set_guardia(self, guardia):
        self.guardia= guardia

    def set_parqueadero(self, parqueadero):
        self.parqueadero=parqueadero
    
    def set_cargo(self, cargo):
        self.cargo = cargo

    def set_observacion(self, observacion):
        self.observacion = observacion
    
