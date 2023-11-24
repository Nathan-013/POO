class Cachorro:
  #Atributo de classe
  especie = 'Canis Lupus Familiaris'

  def __init__(self, nome, idade):
    #Atributo de instancia
    self.nome = nome
    self.idade = idade

  def latir(self):
    print(f'{self.nome} está latindo!')


rex = Cachorro('Rex', 5)
print(rex.especie)
print(rex.nome)
print(rex.idade)
rex.latir()