#Encapsulamento
class ContaBancaria:
  def __init__(self, saldo):
    self.__saldo = saldo

  def depositar(self, valor):
    self.__saldo += valor

  def sacar(self, valor):
    if valor <= self.__saldo:
      self.__saldo -= valor
      return valor
    else:
      return -1

  def consultar_saldo(self):
    return self.__saldo

conta = ContaBancaria(1000)
conta.depositar(500)
print(conta.consultar_saldo())
conta.sacar(200)
print(conta.consultar_saldo())