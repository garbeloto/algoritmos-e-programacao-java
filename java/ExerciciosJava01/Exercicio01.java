package ExerciciosJava01;
import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        Double nota1 = scan.nextDouble();

        System.out.println("Digite a nota 2:");
        Double nota2 = scan.nextDouble();

        System.out.println("Digite a nota 3:");
        Double nota3 = scan.nextDouble();

        System.out.println("Digite a nota 4:");
        Double nota4 = scan.nextDouble();

        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média aritmética é: " + media);
}
}