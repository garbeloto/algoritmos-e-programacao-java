package ExerciciosJava03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma nota entre 0 e 10: ");
        double nota = scan.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
            System.out.println("Digite novamente: ");
            nota = scan.nextDouble();
        }

        System.out.println("Nota válida: " + nota);
    }
}
