package ExerJava01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = lado * lado;
        double dobroArea = area*2;

        System.out.println("A area do quadrado é: "+area);
        System.out.println("O dobro da área é: "+dobroArea);

    }
}
