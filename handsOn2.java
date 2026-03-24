import java.util.Scanner;

public class handsOn2 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distancia;
        double raio = 6371.01;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira a latitude da coordenada 1: ");
        x1 = sc.nextDouble();
        System.out.print("Insira a longitude da coordenada 1: ");
        y1 = sc.nextDouble();
        System.out.print("Insira a latitude da coordenada 2: ");
        x2 = sc.nextDouble();
        System.out.print("Insira a longitude da coordenada 2: ");
        y2 = sc.nextDouble();
        
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        
        distancia = raio * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("A distância entre esses dois pontos é: " + distancia + "km");
        sc.close();
    }
}