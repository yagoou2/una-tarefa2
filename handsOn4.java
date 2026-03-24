import java.util.Scanner;

public class handsOn4 {
    public static void main(String[] args) {
        int tentativa = 0;
        String resposta;
        Scanner sc = new Scanner(System.in);

        boolean acertou = false;

        do {
            tentativa++;

            System.out.println("Tentativa " + tentativa);
            System.out.println("Qual comando no CMD cria um novo diretório?\nA) dir\nB) code .\nC) cd ..\nD) mkdir\nE) cls\n");

            resposta = sc.next();

            switch (resposta.toUpperCase()) {
                case "D":
                    System.out.println("Resposta correta na tentativa " + tentativa + "!");
                    acertou = true;
                    break;
                case "A":
                case "B":
                case "C":
                case "E":
                    System.out.println("Resposta incorreta.\n");
                    break;
                default:
                    System.out.println("Opção inválida.\n");
                    tentativa--;
                    break;
            }

        } while (!acertou && tentativa < 3);

        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas.");
        }

        sc.close();
    }
}