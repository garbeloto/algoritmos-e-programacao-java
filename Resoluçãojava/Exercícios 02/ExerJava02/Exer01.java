package ExerJava02;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = entrada.nextDouble();

        System.out.println("Digite a quarta nota:");
        double nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média é: " + media);

        entrada.close();
    }
}