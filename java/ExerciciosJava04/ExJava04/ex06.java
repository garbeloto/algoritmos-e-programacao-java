package ExerciciosJava04.ExJava04;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[2];
        double[] notas2 = new double[notas1.length];
        double[] media = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Digite a nota 1 do aluno " + (i + 1) + ": ");
            notas1[i] = scan.nextDouble();

            System.out.println("Digite a nota 2 do aluno " + (i + 1) + ": ");
            notas2[i] = scan.nextDouble();

            media[i] = ((notas1[i] + notas2[i]) / 2);
        }

        System.out.println("Notas 1= ");
        for (int i = 0; i < notas1.length; i++) {
            System.out.println(notas1[i]);
        }

        System.out.println("Notas 2= ");
        for (int i = 0; i < notas2.length; i++) {
            System.out.println(notas2[i]);
        }

        System.out.println();
        System.out.println("Resultados: ");
        for (int i = 0; i < notas1.length; i++) {
            if (media[i] >= 7) {
                System.out.println("Média: " + media[i] + "Aprovado!");
            } else {
                System.out.println("Média: " + media[i] + "Reprovado");
            }
        }

    }
}
