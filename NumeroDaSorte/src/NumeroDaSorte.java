import java.util.Random;
import java.util.Scanner;

public class NumeroDaSorte {

    private static Random randomizacao = new Random();

    public static void main(String[] args) {

        System.out.println("\n" +
                "░█████╗░██████╗░██╗██╗░░░██╗██╗███╗░░██╗██╗░░██╗███████╗  ░█████╗░\n" +
                "██╔══██╗██╔══██╗██║██║░░░██║██║████╗░██║██║░░██║██╔════╝  ██╔══██╗\n" +
                "███████║██║░░██║██║╚██╗░██╔╝██║██╔██╗██║███████║█████╗░░  ██║░░██║\n" +
                "██╔══██║██║░░██║██║░╚████╔╝░██║██║╚████║██╔══██║██╔══╝░░  ██║░░██║\n" +
                "██║░░██║██████╔╝██║░░╚██╔╝░░██║██║░╚███║██║░░██║███████╗  ╚█████╔╝\n" +
                "╚═╝░░╚═╝╚═════╝░╚═╝░░░╚═╝░░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝╚══════╝  ░╚════╝░\n" +
                "\n" +
                "███╗░░██╗██╗░░░██╗███╗░░░███╗███████╗██████╗░░█████╗░  ██████╗░░█████╗░  ░██████╗░█████╗░██████╗░████████╗███████╗\n" +
                "████╗░██║██║░░░██║████╗░████║██╔════╝██╔══██╗██╔══██╗  ██╔══██╗██╔══██╗  ██╔════╝██╔══██╗██╔══██╗╚══██╔══╝██╔════╝\n" +
                "██╔██╗██║██║░░░██║██╔████╔██║█████╗░░██████╔╝██║░░██║  ██║░░██║███████║  ╚█████╗░██║░░██║██████╔╝░░░██║░░░█████╗░░\n" +
                "██║╚████║██║░░░██║██║╚██╔╝██║██╔══╝░░██╔══██╗██║░░██║  ██║░░██║██╔══██║  ░╚═══██╗██║░░██║██╔══██╗░░░██║░░░██╔══╝░░\n" +
                "██║░╚███║╚██████╔╝██║░╚═╝░██║███████╗██║░░██║╚█████╔╝  ██████╔╝██║░░██║  ██████╔╝╚█████╔╝██║░░██║░░░██║░░░███████╗\n" +
                "╚═╝░░╚══╝░╚═════╝░╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚═╝░╚════╝░  ╚═════╝░╚═╝░░╚═╝  ╚═════╝░░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░╚══════╝");

        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.print("\nDigite seu nome completo: ");
        nome = scanner.nextLine();

        boolean continuar = true;

        while (continuar) {
            // Randomiza um número entre 0 e 99
            int numeroDaSorte = randomizacao.nextInt(100);
            int tentativas = 0;
            int palpite = -1;

            System.out.println("Bem-vindo(a), " + nome + "! Vamos jogar o Número da Sorte!");

            while (palpite != numeroDaSorte) {
                System.out.print("Digite seu palpite (0 a 99): ");
                palpite = scanner.nextInt();
                tentativas++;

                if (palpite < numeroDaSorte) {
                    System.out.println("Seu palpite está abaixo do número da sorte. Tente novamente!");
                } else if (palpite > numeroDaSorte) {
                    System.out.println("Seu palpite está acima do número da sorte. Tente novamente!");
                } else {
                    System.out.println("Parabéns, " + nome + "! Você acertou o número da sorte: " + numeroDaSorte);
                    System.out.println("Você tentou " + tentativas + " vezes.");
                }
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            continuar = (resposta == 's');
        }

        System.out.println("Obrigado por jogar, " + nome + "! Até a próxima!");
        scanner.close();

        System.out.println("\n" +
                "██╗░░░██╗░█████╗░██╗░░░░░████████╗███████╗  ░██████╗███████╗███╗░░░███╗██████╗░██████╗░███████╗\n" +
                "██║░░░██║██╔══██╗██║░░░░░╚══██╔══╝██╔════╝  ██╔════╝██╔════╝████╗░████║██╔══██╗██╔══██╗██╔════╝\n" +
                "╚██╗░██╔╝██║░░██║██║░░░░░░░░██║░░░█████╗░░  ╚█████╗░█████╗░░██╔████╔██║██████╔╝██████╔╝█████╗░░\n" +
                "░╚████╔╝░██║░░██║██║░░░░░░░░██║░░░██╔══╝░░  ░╚═══██╗██╔══╝░░██║╚██╔╝██║██╔═══╝░██╔══██╗██╔══╝░░\n" +
                "░░╚██╔╝░░╚█████╔╝███████╗░░░██║░░░███████╗  ██████╔╝███████╗██║░╚═╝░██║██║░░░░░██║░░██║███████╗\n" +
                "░░░╚═╝░░░░╚════╝░╚══════╝░░░╚═╝░░░╚══════╝  ╚═════╝░╚══════╝╚═╝░░░░░╚═╝╚═╝░░░░░╚═╝░░╚═╝╚══════╝");
    }
}
