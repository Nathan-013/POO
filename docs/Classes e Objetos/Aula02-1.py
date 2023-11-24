class Animal:
  def __init__(self, nome, idade):
    #Atributo de instancia
    self.nome = nome
    self.idade = idade

  def fazerSom(self):
    print(f'{self.nome} está fazendo som!')

class Cachorro(Animal):
  #HERANÇA
  def latir(self):
    print(f'{self.nome} está latindo!')
  
  #Polimorfismo
  def fazerSom(self):
    print(f'{self.nome}, está latindo!')

class Gato(Animal):
  #Polimorfismo
  def fazerSom(self):
    print(f'{self.nome}, está miando!')


rex = Cachorro('Rex', 5)
mimi = Gato('Mimi', 3)

animais = [rex, mimi]
for animal in animais:
  animal.fazerSom()