public class Main {
    public static void main(String[] args) {
        //QUESTAO 05
        ContaCorrente conta = new ContaCorrente(1234, 2500, true, 1450);

        System.out.println(conta.getLimiteSaque());
        System.out.println(conta.getStatus());

        conta.sacar(1250.60);
        conta.emitirSaldo();
        conta.sacar(3500);
        conta.depositar(250);
        conta.emitirSaldo();
        conta.sacar(500);
        conta.emitirSaldo();
    }
}