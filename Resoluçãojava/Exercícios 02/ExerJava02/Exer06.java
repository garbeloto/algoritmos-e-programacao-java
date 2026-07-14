package ExerJava02;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = entrada.nextDouble();

        double celsius = 5 * (fahrenheit - 32) / 9;

        System.out.println("A temperatura em Celsius é: " + celsius);

        entrada.close();
    }
}