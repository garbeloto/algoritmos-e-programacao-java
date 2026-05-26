package ExerciciosJava02;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota parcial do aluno");
        Double nota1 = scan.nextDouble();

        System.out.println("Informe a primeira nota parcial do aluno");
        Double nota2 = scan.nextDouble();

        Double media = nota1 + nota1 / 2;

        if (media >= 7) {
            System.out.println("Aprovado.");
        } else if (media < 7) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("Aprovado com Distinção.");
        }
    }
}
