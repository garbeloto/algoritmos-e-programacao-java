package ExerJava03;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o lado 1:");
        int lado1 = scan.nextInt();
        
        System.out.println("Entre com o lado 2:");
        int lado2 = scan.nextInt();
        
        System.out.println("Entre com o lado 3:");
        int lado3 = scan.nextInt();
        
        if (((lado1 + lado2) > lado3) && 
            ((lado1 + lado3) > lado2) && 
            ((lado2 + lado3) > lado1)) {
            
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Triângulo Isósceles");
            }
            
        } else {
            System.out.println("Não forma um triângulo");
        }

        scan.close();
    }
}

//Três lados formam um triângulo quando a soma de dois lados é sempre maior que o terceiro lado.
//Equilátero: três lados iguais
//Isósceles: dois lados iguais e um diferente
//Escaleno: três lados diferentes