package ExerciciosJava04;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] media = new double[10];


        for (int i = 0; i < media.length; i++) {

            for (int i1 = 0; i1 < nota1.length; i1++) {
            System.out.println("Digite sua primeira nota: ");
            nota1[i]= scan.nextInt();

            for (int i2 = 0; i2 < nota1.length; i2++) {
            System.out.println("Digite sua segunda nota: ");
            nota2[i]= scan.nextInt();
            
                media[i] = (nota1[i] + nota2[i]) / 2;

                System.out.println("Média: " + media);

                if (media[i] >= 7) {
                    System.out.println("Aluno(a) Aprovado(a)!");
                } else {
                    System.out.println("Aluno(a) Reprovado(a)!");
                }

                }
            }
        }
    }
}
