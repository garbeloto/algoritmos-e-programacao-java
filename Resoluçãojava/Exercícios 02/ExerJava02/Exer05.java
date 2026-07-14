package ExerJava02;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valorHora = entrada.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês?");
        double horasTrabalhadas = entrada.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        double totalDescontos = impostoRenda + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("+ Salário Bruto: R$ " + salarioBruto);
        System.out.println("- IR (11%): R$ " + impostoRenda);
        System.out.println("- INSS (8%): R$ " + inss);
        System.out.println("- Sindicato (5%): R$ " + sindicato);
        System.out.println("= Salário Líquido: R$ " + salarioLiquido);

        entrada.close();
    }
}