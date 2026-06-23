package ExerciciosJava04;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        int soma= 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o " + (i + 1) +  "º número: ");
            A[i]= scan.nextInt();
            
            soma = A[i] + A[i];
        }

        System.out.println("Soma dos elementos: " + soma);
    }
}
