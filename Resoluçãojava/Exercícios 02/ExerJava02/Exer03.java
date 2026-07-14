package ExerJava02;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = entrada.nextDouble();

        double pi = 3.14;
        double area = pi * raio * raio;

         //double area = Math.PI * raio * raio;  faz parte da java lang, não precisa importar, é uma constante que representa o valor de pi, ja o scanner fica na java util, tem que importar

        System.out.println("A área do círculo é: " + area);

        entrada.close();
    }
}