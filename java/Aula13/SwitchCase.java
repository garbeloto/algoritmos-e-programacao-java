package Aula13;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("entre com um dia da semana (1-7)");
        Integer diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-Feira");
            case 3 -> System.out.println("Terça-Feira");
            case 4 -> System.out.println("Quarta-Feira");
            case 5 -> System.out.println("Quinta-Feira");
            case 6 -> System.out.println("Sexta-Feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Não é um dia da semana válido");
               
        }

        /* 
        switch (diaSemana) { 
            case 2:
            case 3:
            case 4: 
            case 5: 
            case 6: System.out.println("Dia da semana");
            break;
            case 1:
            case 7: System.out.println("Sábado");
            break;

            default: System.out.println("Não é um dia da semana válido");
        }
        */

        /*switch (diaSemana) {
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Segunda-Feira");
            break;
            case 3: System.out.println("Terça-Feira");
            break;
            case 4: System.out.println("Quarta-Feira");
            break;
            case 5: System.out.println("Quinta-Feira");
            break;
            case 6: System.out.println("Sexta-Feira");
            break;
            case 7: System.out.println("Sábado");
            break;

            default: System.out.println("Não é um dia da semana válido");
            
        }*/

        
    }
    

    
}
