package ExerciciosJava03;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número para saber a tabuada: ");
        int n1 = scan.nextInt();

        System.out.println("Tabuada de " + n1);

        for (int i = 1; i <= 10; i++) {
            int resultado = i * n1;
            System.out.println(n1 + " x " + i + " = " + resultado);
        }
    }
}
