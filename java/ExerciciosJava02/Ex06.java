package ExerciciosJava02;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu salário: ");
        Double salario = scan.nextDouble();

        Double percentual;

        if (salario <= 2000) {
            percentual = 1.15;  

        } else if (salario > 2000 && salario <= 4000) {
            percentual = 1.10; 

        } else if (salario > 4000 && salario <= 7000) {
            percentual = 1.07; 

        } else {
            percentual = 1.05; 
        }

        Double salarioAtual = salario * percentual;
        Double valorAumento = salarioAtual - salario;



        System.out.println("Salário antes do reajuste: " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual);
        System.out.println("Valor do aumento: " + valorAumento);
        System.out.println("Salário novo: " + salarioAtual);

    }
}
