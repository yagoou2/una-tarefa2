import java.util.Scanner;

public class handsOn3 {
    public static void main(String[] args) {
        String texto;
        int letras = 0;
        int numeros = 0;
        int espacos = 0;
        int outros = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
        char c = texto.charAt(i);

        if (Character.isLetter(c)){
            letras++;
        } else if (Character.isDigit(c)){
            numeros++;
        } else if (Character.isWhitespace(c)){
            espacos++;
        } else {
            outros++;
        }
        }
        
        System.out.println("Quantidade de\nLetras: "+ letras +"\nNúmeros: "+ numeros + "\nEspaços: "+ espacos+"\nOutros: "+outros);
    }
}
