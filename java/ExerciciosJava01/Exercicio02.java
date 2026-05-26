package ExerciciosJava01;
import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número em metros para converte-lo em centímetros :");
        int numero = scan.nextInt();

        int conversor = numero * 100;

        System.out.println("Resultado: " + conversor + " cm");

    }
}
