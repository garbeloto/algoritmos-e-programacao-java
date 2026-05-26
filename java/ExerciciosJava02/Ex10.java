package ExerciciosJava02;

import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros: ");
        Double litros = scan.nextDouble();

        System.out.println("Digite o tipo de combustivel: A - Alcool/Etanol, G - Gasolina ");
        String tipoCombustivel = scan.next();

        double precoLitro = 0;
        double percentualDesconto = 0;
        double valorBruto = 0;
        double valorDesconto = 0;
        double valorFinal = 0;

        switch (tipoCombustivel) {
            case "A":
                precoLitro = 4;

                if (litros <= 20) {
                    percentualDesconto = 0.03;
                } else {
                    percentualDesconto = 0.05;
                }
                valorBruto = litros * precoLitro;
                valorDesconto = valorBruto * percentualDesconto;
                valorFinal = valorBruto - valorDesconto;

                System.out.println("Combustivel: Alcool etanol");
                System.out.println("Quantidade litros: " + litros);
                System.out.println("Valor bruto: " + valorBruto);
                System.out.println("Valor desconto: " + valorDesconto);
                System.out.println("Valor a pagar: " + valorFinal);

                break;

                    case "G":
                    precoLitro = 6;

                    if (litros <= 20) {
                        percentualDesconto = 0.04;
                    } else {
                        percentualDesconto = 0.06;
                    }
                    valorBruto = litros * precoLitro;
                    valorDesconto = valorBruto * percentualDesconto;
                    valorFinal = valorBruto - valorDesconto;

                    System.out.println("Combustivel: gasolina");
                    System.out.println("Quantidade litros: " + litros);
                    System.out.println("Valor bruto: " + valorBruto);
                    System.out.println("Valor desconto: " + valorDesconto);
                    System.out.println("Valor a pagar: " + valorFinal);

                    break;
            default:
               System.out.println("Tipo de combustivel invalido");
        }


        

    }
}
