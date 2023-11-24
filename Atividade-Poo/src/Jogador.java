import java.time.LocalDate;
public class Jogador {
    private String nome;
    private LocalDate dtNascimento;
    private String posicao, nacionalidade;
    private double altura, peso;

    public Jogador(String nome, String pos, LocalDate nasc, String naci, double altura, double peso){
        this.nome = nome;
        this.posicao = pos;
        this.dtNascimento = nasc;
        this.nacionalidade = naci;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void imprimirDados() {
        System.out.printf("Jogador: %s\n" +
                "Posição: %s\n" +
                "Nascimento: %s\n" +
                "Nacionalidade: %s\n" +
                "Altura: %.2f metros\n" +
                "Peso: %.2f Kgs\n", nome, posicao, dtNascimento, nacionalidade, altura, peso);
    }

    public int getIdade() {
        return 2023 - this.dtNascimento.getYear();
    }

    public String getAposentadoria() {
        int anosAposentar;

        if (posicao.equals("Defesa")) {
            anosAposentar = 40 - this.getIdade();
        } else if (posicao.equals("Meio-campo")) {
            anosAposentar = 38 - this.getIdade();
        } else if (posicao.equals("Atacante")) {
            anosAposentar = 35 - this.getIdade();
        } else {
            return "Erro ao receber a posição do jogador!";
        }

        if (anosAposentar <= 0 ){
            return "O jogador já pode se aposentar";
        }

        return "O jogador irá se aposentar em " + anosAposentar + " anos.";
    }
}
