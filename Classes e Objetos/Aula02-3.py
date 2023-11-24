#M etodos reservado de python

class Cachorro:
  # inicializa o objeto (1o a rodar quando chama o construtor)
  def __init__(self,nome,idade):
    self.nome = nome
    self.idade = idade

  # representa objetos como string
  def __str__(self):
    return f'{self.nome}, {self.idade} anos.'

meu_cachorro = Cachorro("Rex", 5)
print(meu_cachorro)