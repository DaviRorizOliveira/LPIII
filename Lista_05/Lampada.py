class Lampada:
    # Métodos especiais __new__ e __init__
    def __new__(cls):
        instance = super().__new__(cls)
        instance.ligada = False
        instance.meiaLuz = False
        instance.luminosidade = 0
        return instance

    def getLuminosidade(self):
        return self.luminosidade

    def acende(self):
        self.ligada = True
        self.meiaLuz = False
        self.luminosidade = 100

    def apaga(self):
        self.ligada = False
        self.meiaLuz = False
        self.luminosidade = 0

    def meiaLuz(self):
        if self.luminosidade > 0:
            self.meiaLuz = True
        else:
            self.meiaLuz = False

    def validaLuminosidade(self, num):
        if 0 <= num <= 100:
            return True
        else:
            return False

    def setLuminosidade(self, num):
        if self.validaLuminosidade(num):
            self.luminosidade = num
        else:
            print("Invalid number!!")
            self.luminosidade = 0

    def setEstado(self):
        if self.luminosidade == 0:
            self.ligada = False
            self.meiaLuz = False
        elif self.luminosidade == 100:
            self.ligada = True
            self.meiaLuz = False
        else:
            self.ligada = True
            self.meiaLuz = True

    def printaInformacoes(self):
        if self.ligada == False:
            print("A lâmpada está desligada")
        elif self.ligada == True and self.meiaLuz == True:
            print("A lâmpada está ligada e com 100% de seu brilho")
        else:
            print(f"A lâmpada está em meia-luz e com {self.luminosidade}% de seu brilho")