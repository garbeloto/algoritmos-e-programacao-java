package ExerJava03;

import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros:");
        double litros = entrada.nextDouble();

        System.out.println("Digite o tipo de combustível:");
        System.out.println("A - Álcool/Etanol");
        System.out.println("G - Gasolina");
        String tipoCombustivel = entrada.next();

        double precoLitro = 0;
        double percentualDesconto = 0;
        double valorBruto = 0;
        double valorDesconto = 0;
        double valorFinal = 0;

        switch (tipoCombustivel.toUpperCase()) {
            case "A":
                precoLitro = 4.00;

                if (litros <= 20) {
                    percentualDesconto = 0.03;
                } else {
                    percentualDesconto = 0.05;
                }

                valorBruto = litros * precoLitro;
                valorDesconto = valorBruto * percentualDesconto;
                valorFinal = valorBruto - valorDesconto;

                System.out.println("Combustível: Álcool/Etanol");
                System.out.println("Quantidade de litros: " + litros);
                System.out.println("Valor bruto: R$ " + valorBruto);
                System.out.println("Desconto: R$ " + valorDesconto);
                System.out.println("Valor a pagar: R$ " + valorFinal);
                break;

            case "G":
                precoLitro = 6.00;

                if (litros <= 20) {
                    percentualDesconto = 0.04;
                } else {
                    percentualDesconto = 0.06;
                }

                valorBruto = litros * precoLitro;
                valorDesconto = valorBruto * percentualDesconto;
                valorFinal = valorBruto - valorDesconto;

                System.out.println("Combustível: Gasolina");
                System.out.println("Quantidade de litros: " + litros);
                System.out.println("Valor bruto: R$ " + valorBruto);
                System.out.println("Desconto: R$ " + valorDesconto);
                System.out.println("Valor a pagar: R$ " + valorFinal);
                break;

            default:
                System.out.println("Tipo de combustível inválido.");
        }

        entrada.close();
    }
}