package ExerciciosJava04;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        int numeroPar = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o " + (i + 1) +  "º número: ");
            A[i]= scan.nextInt();
            
            if (A[i] % 2 == 0) {
                numeroPar+= 1 ;
            }
        }

        System.out.println("Quantidade de números pares: " + numeroPar);

        


    }
}
