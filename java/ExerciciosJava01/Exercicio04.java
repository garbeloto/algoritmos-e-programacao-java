package ExerciciosJava01;
import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do lado do quadrado: ");
        Double lado = scan.nextDouble();

        Double area = lado * lado;

        Double dobro = area * 2;

        System.out.println("Área do quadrado: " + area);
        System.out.println("Dobro da área do quadrado: " + dobro);
    }
}
