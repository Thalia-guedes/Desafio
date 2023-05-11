import java.util.Random;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
            jogarNovamente();

            jogar();
    }

    public static void jogarNovamente (){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem vindo ao jogo dos dados ");
        System.out.println("                             ");
        System.out.println("Digite um numero para começar a partida ");
        int numero = scanner.nextInt();

        int numeroAleatorio = random.nextInt(10)+1;
        System.out.println("O numero aleatorio foi gerado " + numeroAleatorio);
        System.out.println("                             ");

        if ( numero == numeroAleatorio){
            System.out.println("Parabens voce ganhou 10 Pontos");
            numero +=10;
            System.out.println("                             ");
        } else if (numero == numeroAleatorio -1 ||numero == numeroAleatorio +1 ) {
            System.out.println("Parabens voce ganhou 5 pontos");
            numero += 5;
            System.out.println("                             ");

        } else {
            System.out.println("Infelizmente voce nao ganhou pontos :(");
            System.out.println("                             ");
        }
        System.out.println("Deseja jogar novamente?");
        String resposta = scanner.next();
        System.out.println("                             ");

    }
    public  static void jogar (){
            jogarNovamente();
    }

}


