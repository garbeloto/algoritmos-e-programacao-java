package estudos;

import java.util.Scanner;

public class OrdenacaoPrecos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_PRODUTOS = 8;
        double[] precos = new double[TOTAL_PRODUTOS];

        System.out.println("=== ORDENACAO DE PRECOS ===");
        System.out.println("Informe o preco dos " + TOTAL_PRODUTOS + " produtos.\n");

        // ---- ENTRADA DE DADOS ----
        for (int i = 0; i < TOTAL_PRODUTOS; i++) {
            System.out.print("Preco do produto " + (i + 1) + ": R$ ");
            precos[i] = scanner.nextDouble();
        }

        double[] precosOriginais = precos.clone();

        // ---- ORDENACAO (metodo bolha) ----
        for (int i = 0; i < TOTAL_PRODUTOS - 1; i++) {
            for (int j = 0; j < TOTAL_PRODUTOS - 1 - i; j++) {
                if (precos[j] > precos[j + 1]) {
                    double temp = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = temp;
                }
            }
        }

        // ---- RELATORIO FINAL ----
        System.out.println("\n===== RELATORIO FINAL =====");

        System.out.println("\nPrecos antes da ordenacao:");
        for (int i = 0; i < TOTAL_PRODUTOS; i++) {
            System.out.printf("R$ %.2f  ", precosOriginais[i]);
        }

        System.out.println("\n\nPrecos depois da ordenacao:");
        for (int i = 0; i < TOTAL_PRODUTOS; i++) {
            System.out.printf("R$ %.2f  ", precos[i]);
        }

        System.out.printf("%n%nMenor preco: R$ %.2f%n", precos[0]);
        System.out.printf("Maior preco: R$ %.2f%n", precos[TOTAL_PRODUTOS - 1]);

        scanner.close();
    }
}
