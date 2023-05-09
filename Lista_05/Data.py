class Data:
    # Métodos especiais __new__ e __init__
    def __new__(cls, dia, mes, ano):
        if not cls.verificarData(dia, mes, ano):
            print("Data inválida!")
            return None
        else:
            return super().__new__(cls)

    def __init__(self, dia, mes, ano):
        self.dia = dia
        self.mes = mes
        self.ano = ano
    
    # Método para verificar se a data é válida
    def verificarData(self):
        if self.mes < 1 or self.mes > 12: # Confere se o mês é válido
            return False
        elif self.dia < 1 or self.dia > 31: # Confere se o dia é válido
            return False
        elif self.mes == 2: # Confere se Fevereiro é válido
            if self.dia > 29:
                return False
        elif self.mes in [4, 6, 9, 11]: # Confere se os meses que tem 30 dias são válidos
            if self.dia > 30:
                return False
        else:
            return True
    
    # Métodos get
    def getDia(self):
        return self.dia
    def getMes(self):
        return self.mes
    def getAno(self):
        return self.ano
    
    # Métodos set
    def setDia(self, dia):
        self.dia = dia
    def setMes(self, mes):
        self.mes = mes
    def setAno(self, ano):
        self.ano = ano

    # Método para imprimir a data no formato dd/mm/yyyy
    def imprimirData(self):
        print(f"{self.dia:02d}/{self.mes:02d}/{self.ano}")
    
    # Método para imprimir a data por extenso
    def imprimirDataExtenso(self):
        nome_mes = ["janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"]
        print(f"{self.dia} de {nome_mes[self.mes - 1]} de {self.ano}.")
    
    # Método para saber se uma data é anterior a outra
    def isPrevious(self, outraData):
        if self.ano < outraData.getAno(): # Confere o ano
            return True
        elif self.ano == outraData.getAno() and self.mes < outraData.getMes(): # Confere o mês de um mesmo ano
            return True
        elif self.ano == outraData.getAno() and self.mes == outraData.getMes() and self.dia < outraData.getDia(): # Confere o dia de um mesmo mês de um mesmo ano
            return True
        else:
            return False
    
    # Método que calcula quantos dias se passam entre uma data e outra
    def howManyDays(self, outraData):
        # Converte as duas datas
        data_01 = self.dia + (self.mes - 1) * 30 + (self.ano - 1) * 365
        data_02 = outraData.dia + (outraData.mes - 1) * 30 + (outraData.ano - 1) * 365
        days = data_02 - data_01 # Calcula a diferença entre as duas datas inseridas
        return days