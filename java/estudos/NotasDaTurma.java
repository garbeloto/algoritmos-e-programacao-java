package estudos;

import java.util.Scanner;

public class NotasDaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_ALUNOS = 10;
        double[] notas = new double[TOTAL_ALUNOS];

        System.out.println("=== NOTAS DA TURMA ===");
        System.out.println("Informe a nota final de cada um dos " + TOTAL_ALUNOS + " alunos (de 0 a 10).\n");

        // ---- ENTRADA DE DADOS ----
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            double nota;
            boolean valida = false;

            do {
                System.out.print("Nota do aluno " + (i + 1) + ": ");
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    valida = true;
                } else {
                    System.out.println("Nota invalida! Digite um valor entre 0 e 10.");
                }
            } while (!valida);

            notas[i] = nota;
        }

        // ---- CALCULOS ----
        int aprovados = 0;
        int reprovados = 0;
        double soma = 0;

        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            soma += notas[i];

            if (notas[i] >= 6) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = soma / TOTAL_ALUNOS;

        // ---- RELATORIO FINAL ----
        System.out.println("\n===== RELATORIO FINAL =====");

        System.out.println("\nNotas informadas:");
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("\nAlunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);
        System.out.printf("Media geral da turma: %.2f%n", media);

        scanner.close();
    }
}
