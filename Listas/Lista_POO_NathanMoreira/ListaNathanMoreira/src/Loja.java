//Questão 06 da lista de POO

import java.util.ArrayList;
import java.util.Scanner;

class Cliente {
    String nome;
    String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}

class Produto {
    String nome;
    double preco;
    String validade;

    public Produto(String nome, double preco, String validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }
}

class Compra {
    Cliente cliente;
    ArrayList<Produto> produtos;
    double total;

    public Compra(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        total += produto.preco;
    }

    public void finalizarCompra() {
        System.out.println("Compra realizada com sucesso!");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.printf("- %s  | Preço: R$ %.2f\n", produto.nome, produto.preco);
        }
        System.out.printf("Total a ser pago: R$%.2f\n", total);
    }
}
public class Loja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("Bem vindo a loja Fucapi");
        System.out.println("Digite o nome do Cliente:");
        String nC = input.nextLine();
        System.out.println("Digite o CPF do Cliente:");
        String cpf = input.nextLine();

        Cliente cliente = new Cliente(nC, cpf);
        Compra compra = new Compra(cliente);

        do {
            System.out.println("\n\tCriação de Produtos");
            System.out.println("Digite 1 para criar um produto");
            System.out.println("Digite 0 para sair\n");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Produto");
                    input.nextLine();
                    String np = input.nextLine();
                    System.out.println("Digite o preço do Produto:");
                    double preco = input.nextDouble();
                    System.out.println("Digite a validade do Produto:");
                    input.nextLine();
                    String val = input.nextLine();

                    Produto prod = new Produto(np, preco, val);
                    compra.adicionarProduto(prod);
                    break;
                case 0:
                    System.out.println("Saindo..\n");
                    break;
                default:
                    System.out.println("Opção Inválida\n");
                    break;
            }
        } while(opcao != 0);

        compra.finalizarCompra();
    }
}
