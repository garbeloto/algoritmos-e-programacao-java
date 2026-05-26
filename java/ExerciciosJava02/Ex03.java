package ExerciciosJava02;

import java.util.Scanner;

public class Ex03 {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scan.nextLine();

        if (letra.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else if (letra.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }
     }
}
