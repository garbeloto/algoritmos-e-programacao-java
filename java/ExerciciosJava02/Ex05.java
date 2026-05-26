package ExerciciosJava02;

import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual turno você estuda? \n M - Matutino\r\n" + "V - Vespertino\r\n" + "N - Noturno");
        String turno = scan.nextLine();

        


        if (turno == "M") {
            System.out.println("Bom dia!");
        } else if (turno == "V") {
            System.out.println("Bom dia!");
        } else if (turno == "N") {
            System.out.println("Boa noite!");
        }
        else {
            System.out.println("Valor inválido!");
        }



    }


}
