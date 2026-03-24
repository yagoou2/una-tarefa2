import java.util.Scanner;

public class handsOn4 {
    public static void main(String[] args) {
        int tentativa = 0;
        String resposta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual comando no CMD cria um novo diretório?\nA) dir\nB) code .\nC) cd ..\nD) mkdir\nE) cls\n");
        resposta = sc.next();

        if (!resposta.equalsIgnoreCase("D")) {
            do {
                tentativa++;
                System.out.println("Resposta incorreta\nQual comando no CMD cria um novo diretório?\nA) dir\nB) code .\nC) cd ..\nD) mkdir\nE) cls\n");
                resposta = sc.next();
            } while (!resposta.equalsIgnoreCase("D") && tentativa < 2);
        }

        if (resposta.equalsIgnoreCase("D")) {
            System.out.println("Certa resposta!");
        } else {
            System.out.println("Número de tentativas esgotado!");
        }
        sc.close();
    }
}