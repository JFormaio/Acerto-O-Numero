import java.util.Scanner;
import java.util.Random;

public class Acerte_O_Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1;
        int totalTentativas = 5;
        int chutesTentativas = 0;
        boolean acertou = false;
        
        System.out.println("Bem vindo ao meu jogo de Adivinhação!");
        System.out.println("Seguinte meu amigo, você tem agora " + totalTentativas + " tentativas para adivinhar um número entre 1 e 100. ");
        System.out.println("BOA SORTE (: ");

        while (chutesTentativas < totalTentativas && !acertou) {
            System.out.println("DIGITE e tente acertar o numero sorteado! ");
            int chute = scanner.nextInt();
            chutesTentativas++;

            if (chute < numeroSorteado) {
                System.out.println("Seu chute é menor que o número, TENTE CHUTAR UM NÚMERO MAIOR!");

            } else if (chute > numeroSorteado) {
                System.out.println("Seu chute é maior que o número, TENTE CHUTAR UM NÚMERO MENOR!");
            
            } else {
                acertou = true;
                System.out.println("BOA !!! FINALMENTE SEU CHUTE ACERTOU ! PARABÉNS !");
            }
        }

        if (!acertou) {
            System.out.println("Bahhh seus chutes acabaram ... E você não chutou certo o número. O chute certo era " + numeroSorteado);
        }

        System.out.println("Tentativas de Chutes " + chutesTentativas);
        scanner.close();
    }
}