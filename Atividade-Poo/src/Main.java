import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ribamar", "Meio-campo", LocalDate.of(2001, Month.JULY, 13), "Brasileiro", 1.77, 74.8);

        jogador1.imprimirDados();
        System.out.println(jogador1.getIdade());
        System.out.println(jogador1.getAposentadoria());
    }
}