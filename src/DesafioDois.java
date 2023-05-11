import java.util.Random;
import java.util.Scanner;

public class DesafioDois {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        boolean jogarNovamente = true;


        System.out.println("Digite um numero de 6 a 1 ");
        int numero1 = scanner.nextInt();

        Random gerador = new Random();

        int numeroAleatorio = gerador.nextInt(6) + 1;
        System.out.println(numeroAleatorio);
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
