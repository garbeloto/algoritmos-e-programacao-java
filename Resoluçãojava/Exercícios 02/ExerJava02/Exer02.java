package ExerJava02;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma medida em metros:");
        double metros = entrada.nextDouble();

        double centimetros = metros * 100;

        System.out.println("A medida em centímetros é: " + centimetros);

        entrada.close();
    }
}