package ExerciciosJava04.ExJava04;

import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a idade da pessoa " + i);
            idades[i]= scan.nextInt();
        }

        int menorIdade = idades[0];
        int maiorIdade = idades[0];
        int posicaoMenorIdade = 0;
        int posicaoMaiorIdade = 0;

        for (int i = 0; i < idades.length; i++) {
            
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaiorIdade = i;
            } else if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                posicaoMenorIdade = i;
            }

        }

        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Posição da menor idade: " + posicaoMenorIdade);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Posição da maior idade: " + posicaoMaiorIdade);


    }

}
