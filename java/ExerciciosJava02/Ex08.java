package ExerciciosJava02;

import java.util.Scanner;

public class Ex08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado do triângulo");
        Double lado1 = scan.nextDouble();

        System.out.println("Digite o valor do segundo lado do triângulo");
        Double lado2 = scan.nextDouble();

        System.out.println("Digite o valor do segundo lado do triângulo");
        Double lado3 = scan.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado3 && lado3 + lado3 > lado3) {
            System.out.println("é possivel formar um triangulo");
            
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Não é possivel formar um triângulo");
        }
        
    }
}
