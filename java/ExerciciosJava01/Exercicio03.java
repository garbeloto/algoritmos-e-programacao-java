package ExerciciosJava01;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 

        System.out.println("Informe o raio de um círculo para calcular a área: ");
        Double raio = scan.nextDouble();


        Double area = Math.PI * (raio * raio);

        System.out.println("Resultado da área do círculo: " + area);
    }
}
