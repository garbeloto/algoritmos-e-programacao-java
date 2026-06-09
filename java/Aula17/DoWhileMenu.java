package Aula17;

import java.util.Scanner;

public class DoWhileMenu {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Consultar Aluno");
            System.out.println("3 - Sair");
            System.out.println("Digite sua opção: ");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Opção escolhida: cadastrar aluno.");
            } else if (opcao == 2) {
                System.out.println("Opção escolhida: consultar aluno.");
            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema");
            } else {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 3);
    }
}
