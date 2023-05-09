class Hora:
    # Métodos especiais __new__ e __init__
    def __new__(cls, hora, minuto, segundo):
        if hora < 0 or hora > 24:
            hora = 0
        if minuto < 0 or minuto > 60:
            minuto = 0
        if segundo < 0 or segundo > 60:
            segundo = 0
        return super().__new__(cls)

    def __init__(self, hora, minuto, segundo):
        self.hora = hora
        self.minuto = minuto
        self.segundo = segundo

    # Método para validar o horário
    def validateTime(self, hora, minuto, segundo):
        if hora < 0 or hora > 24:
            return False
        if minuto < 0 or minuto > 60:
            return False
        if segundo < 0 or segundo > 60:
            return False
        else:
            return True

    # Métodos get
    def getHora(self):
        return self.hora

    def getMinuto(self):
        return self.minuto

    def getSegundo(self):
        return self.segundo

    # Métodos set
    def setTime(self, hora, minuto, segundo):
        if self.validateTime(hora, minuto, segundo):
            self.hora = hora
            self.minuto = minuto
            self.segundo = segundo
        else:
            self.hora = 0
            self.minuto = 0
            self.segundo = 0

    def getTime(self):
        return f"{self.hora}:{self.minuto}:{self.segundo}"

    def printTime(self):
        print(self.getTime())
    
    # Método para saber se é antes de meio dia
    def isAm(self):
        if self.hora < 12:
            return True
        else:
            return False
    
    # Método que retorna a quantidade de segundos transcorridos desde a hora enviada como parâmetro
    def cron(self, outraHora):
        if outraHora.hora < self.hora or (outraHora.hora == self.hora and outraHora.minuto < self.minuto) or (outraHora.hora == self.hora and outraHora.minuto == self.minuto and outraHora.segundo < self.segundo):
            segundos = (24 - self.hora + outraHora.hora) * 3600 + (60 - self.minuto + outraHora.minuto) * 60 + 60 - self.segundo + outraHora.segundo
        else:
            segundos = (outraHora.hora - self.hora) * 3600 + (outraHora.minuto - self.minuto) * 60 + outraHora.segundo - self.segundo
        return segundos