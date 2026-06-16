package ExerciciosJava03;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero = scan.nextInt();

        int maior = 0;
        for (int i = 2; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número: ");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            
        }

        System.out.println("O maior número digitado foi: " + numero);
    }
}
