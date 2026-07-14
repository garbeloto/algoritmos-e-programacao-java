package ExerJava01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma medida em metros: ");
        double metros = scan.nextDouble();

        double centimetros = metros * 100;

        System.out.println("A medida em centímetros é: "+centimetros);
    }
}
