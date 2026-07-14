package ExerJava02;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado:");
        double lado = entrada.nextDouble();

        double area = lado * lado;
        double dobroArea = area * 2;

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área é: " + dobroArea);

        entrada.close();
    }
}