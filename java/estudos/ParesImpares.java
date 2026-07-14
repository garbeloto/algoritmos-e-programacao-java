package estudos;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_NUMEROS = 15;
        int[] numeros = new int[TOTAL_NUMEROS];

        System.out.println("=== PARES E IMPARES ===");
        System.out.println("Informe " + TOTAL_NUMEROS + " numeros inteiros.\n");

        // ---- ENTRADA DE DADOS ----
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // ---- CALCULOS ----
        int qtdPares = 0;
        int qtdImpares = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            if (numeros[i] % 2 == 0) {
                qtdPares++;
                somaPares += numeros[i];
            } else {
                qtdImpares++;
                somaImpares += numeros[i];
            }
        }

        // ---- RELATORIO FINAL ----
        System.out.println("\n===== RELATORIO FINAL =====");

        System.out.println("\nNumeros informados:");
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("\nQuantidade de numeros pares: " + qtdPares);
        System.out.println("Quantidade de numeros impares: " + qtdImpares);
        System.out.println("Soma dos numeros pares: " + somaPares);
        System.out.println("Soma dos numeros impares: " + somaImpares);

        scanner.close();
    }
}
