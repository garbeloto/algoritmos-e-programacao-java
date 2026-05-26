package AvaliacaoJava;

import java.util.Scanner;

public class Questao01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do paciente: ");
        String nome = scan.next();

        System.out.println("Informe a hora de entrada: ");
        int horaEntrada = scan.nextInt();

        System.out.println("Informe a hora de saída: ");
        int horaSaida = scan.nextInt();

        int horasTotais = 0;

        if (horaSaida <= horaEntrada) {
            horasTotais= (horaSaida - horaEntrada) + 24;
            System.out.println("Horas totais: " + horasTotais);
        } else if (horaSaida > horaEntrada) {
            horasTotais = horaSaida - horaEntrada;
            System.out.println("Horas totais: " + horasTotais);
        } else {
            System.out.println("Limite máximo 24 horas");
        }

        System.out.println("Nome do paciente: " + nome);
        System.out.println("Hora de entrada: " + horaEntrada);
        System.out.println("Hora de saída: " + horaSaida);
        System.out.println("Tempo total de permanência em horas: " + horasTotais);
    }
}
