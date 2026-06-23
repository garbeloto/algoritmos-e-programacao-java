package ExerciciosJava04;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        int numeroPar = 0;
        int menor = 0;
        int posicaoMenor = 0;
        int maior = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Digite sua idade: ");
            idades[i]= scan.nextInt();
            
            if (idades[i] > maior) {
                maior = idades[i];
                posicaoMaior = i + 1;
                
            }  else if (idades[i] < maior) {
                menor = idades[i];
                posicaoMenor = i + 1;
            }
            
        }
        System.out.println("A menor idade é: " + menor);
        System.out.println("A posição da menor idade é: " + posicaoMenor);
        System.out.println("A maior idade é: " + maior);
        System.out.println("A posição da maior idade é: " + posicaoMaior);
        
    }
}
