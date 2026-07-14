package ExerJava01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperatura = scan.nextDouble();

        double celsius = (5 * (temperatura-32) / 9);

        System.out.println("A temperatura em Celsius é: "+celsius);
    }
}
