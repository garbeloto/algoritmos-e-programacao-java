package ExerciciosJava02;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        Double valor = scan.nextDouble();

        if (valor > 0) {
            System.out.println("Valor positivo.");
        } else {
            System.out.println("Valor negativo.");
        }
    }
}
