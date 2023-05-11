import java.util.Scanner;
import java.util.Random;

public class Desafio {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        Random gerador = new Random();
        boolean jogarNovamente = true;

        System.out.println("Digite um numero de 6 a 1 ");
        int numero = scanner.nextInt();


        int numeroAleatorio = gerador.nextInt(6) + 1;
        System.out.println(numeroAleatorio);
        if (numeroAleatorio == numero) {
            System.out.println(" Parabens voce ganhou 10 pontos ");
            return;
        } else if (numero > numeroAleatorio) {
            System.out.println(" o jogador ganhou 5 pontos");

        }
        if (numero < numeroAleatorio) {
            System.out.println(" Voce perdeu o jogo");

        }
        System.out.println("Deseja jogar novamente? (S/N)");
        String jogar = scanner.next();

        if (!jogar.equalsIgnoreCase("S")) {
            jogarNovamente = false;
        }
    }

}
