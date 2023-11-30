// Questão 05 da lista de POO
public class ContaCorrente {
    private int numero;
    private double saldo, limiteSaque;
    private boolean status;

    public ContaCorrente(int numero, double saldo, boolean status, double limiteSaque) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = status;
        this.limiteSaque = limiteSaque;
    }

    public double sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Você não tem saldo suficiente!");
            return -1;
        } else if (valor >= this.limiteSaque) {
            System.out.println("O valor a sacar é maior que o limite permitido!");
            return -1;
        }

        setSaldo(this.saldo - valor);
        System.out.println("Saque realizado com sucesso!");
        return this.saldo;
    }

    public double depositar(double valor) {
        setSaldo(valor + this.saldo);

        return this.saldo;
    }

    public void emitirSaldo() {
        System.out.printf("Saldo atual: R$%.2f\n", this.saldo);
    }

    //getter e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
