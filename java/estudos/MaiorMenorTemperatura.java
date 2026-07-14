package estudos;

import java.util.Scanner;

public class MaiorMenorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DIAS_SEMANA = 7;
        String[] nomesDias = {"Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};
        double[] temperaturas = new double[DIAS_SEMANA];

        System.out.println("=== TEMPERATURAS DA SEMANA ===\n");

        // ---- ENTRADA DE DADOS ----
        for (int i = 0; i < DIAS_SEMANA; i++) {
            System.out.print("Temperatura maxima de " + nomesDias[i] + " (C): ");
            temperaturas[i] = scanner.nextDouble();
        }

        // ---- CALCULOS ----
        double maior = temperaturas[0];
        double menor = temperaturas[0];
        int diaMaior = 0;
        int diaMenor = 0;

        for (int i = 1; i < DIAS_SEMANA; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
                diaMaior = i;
            }

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
                diaMenor = i;
            }
        }

        // ---- RELATORIO FINAL ----
        System.out.println("\n===== RELATORIO FINAL =====");

        System.out.println("\nTemperaturas informadas:");
        for (int i = 0; i < DIAS_SEMANA; i++) {
            System.out.println(nomesDias[i] + ": " + temperaturas[i] + " C");
        }

        System.out.println("\nDia mais quente: " + nomesDias[diaMaior] + " (" + maior + " C)");
        System.out.println("Dia mais frio: " + nomesDias[diaMenor] + " (" + menor + " C)");

        scanner.close();
    }
}
