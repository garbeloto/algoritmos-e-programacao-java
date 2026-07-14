package ExerJava03;

import java.util.Scanner;

public class Exer26Melhorado {
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
        String nomeCombustivel = "";
        boolean combustivelValido = true;

        switch (tipoCombustivel.toUpperCase()) {
            case "A":
                nomeCombustivel = "Álcool/Etanol";
                precoLitro = 4.00;

                if (litros <= 20) {
                    percentualDesconto = 0.03;
                } else {
                    percentualDesconto = 0.05;
                }
                break;

            case "G":
                nomeCombustivel = "Gasolina";
                precoLitro = 6.00;

                if (litros <= 20) {
                    percentualDesconto = 0.04;
                } else {
                    percentualDesconto = 0.06;
                }
                break;

            default:
                combustivelValido = false;
                System.out.println("Tipo de combustível inválido.");
        }

        if (combustivelValido) {
            double valorBruto = litros * precoLitro;
            double valorDesconto = valorBruto * percentualDesconto;
            double valorFinal = valorBruto - valorDesconto;

            System.out.println("Combustível: " + nomeCombustivel);
            System.out.println("Quantidade de litros: " + litros);
            System.out.println("Preço por litro: R$ " + precoLitro);
            System.out.println("Valor bruto: R$ " + valorBruto);
            System.out.println("Desconto: R$ " + valorDesconto);
            System.out.println("Valor a pagar: R$ " + valorFinal);
        }

        entrada.close();
    }
}