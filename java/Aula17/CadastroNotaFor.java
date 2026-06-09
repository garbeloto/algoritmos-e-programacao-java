package Aula17;

import java.util.Scanner;

public class CadastroNotaFor {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int qtdAlunos = 5;
        double somaNotas = 0;
        int aprovados = 0;
        int reprovados = 0;
        double maiorNota = 0;
        String alunoMaiorNota = "";

        System.out.println("=== Sistema de Cadastro de Notas ===");
        
        for(int i = 1; i <= qtdAlunos; i++){

            System.out.println("\n Cadastro de aluno.");

            System.out.println("Digite o nome do aluno: ");
            String nome = scan.next();

            System.out.println("Digite a nota do aluno: ");
            double nota = scan.nextDouble();

            somaNotas =+ nota;

            if (nota >= 7) {
                aprovados++;
                System.out.println("Aluno aprovado.");
            } else {
                reprovados++;
                System.out.println("Aluno reprovado.");
            }

            if (i == 1 || nota > maiorNota) {
                maiorNota = nota;
                alunoMaiorNota = nome;
            }

        }

        double mediaTurma = somaNotas / qtdAlunos;

        System.out.println("\n=== Resultado da turma ===");
        System.out.println("Quantidade de alunos cadastrados: " + qtdAlunos);
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Quantidade de Aprovados: " + aprovados);
        System.out.println("Quantidade de Reprovados: " + reprovados);
        System.out.println("Aluno coma maior nota: " + alunoMaiorNota);
        System.out.println("Maior nota: " + maiorNota);

    }
}
