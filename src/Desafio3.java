import java.util.Random;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("Digite um número de 1 a 6: ");
            int numero1 = scanner.nextInt();
            int numeroAleatorio = rand.nextInt(6) + 1;

            System.out.println("Número sorteado: " + numeroAleatorio);

            if (numeroAleatorio == numero1) {
                System.out.println(" Parabens voce ganhou 10 pontos ");
                return;
            } else if (numero1 > numeroAleatorio) {
                System.out.println(" o jogador ganhou 5 pontos");

            }
            if (numero1 < numeroAleatorio) {
                System.out.println(" Voce perdeu o jogo");

            }

            System.out.println("Deseja jogar novamente? (S/N)");
            String jogar = scanner.next();

            if (!jogar.equalsIgnoreCase("S")) {
                jogarNovamente = false;
            }


        }

    }
}
