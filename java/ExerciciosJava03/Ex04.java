package ExerciciosJava03;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = scan.nextInt();
            int soma = numero + numero;
            double media = soma / 5;

            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        } */

        int soma=0;
        System.out.println("Digite o limite de números a contar");
        int fim = scan.nextInt();

        for (int i = 1; i <= fim; i++) {
            System.out.println("Digite o " + i + "º número: ");
            int numero = scan.nextInt();
            soma+=numero;
        }

        double media = soma / fim;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        
        

        
        
    }
}
