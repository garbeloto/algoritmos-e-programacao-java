package ExerJava01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = scan.nextDouble();
        
        //double pi = Math.PI;45
        double area = Math.PI * (raio * raio);

        System.out.println("A area do circulo é: "+area);


    }
}
