package ExerJava03;

import java.util.Scanner;

public class Exer06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o salário:");
        double salario = scan.nextDouble();
        
        int percentual = 0;
        
        if (salario <= 2000) {
            percentual = 15;
        } else if (salario <= 4000) {
            percentual = 10;
        } else if (salario <= 7000) {
            percentual = 7;
        } else {
            percentual = 5;
        }
        
        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;
        
        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + salarioAjustado);

        scan.close();
    }
}