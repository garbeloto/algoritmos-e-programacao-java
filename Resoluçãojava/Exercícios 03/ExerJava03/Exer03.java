package ExerJava03;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com uma letra (F ou M):");
        char input = scan.next().charAt(0);
        
       if (input == 'f'){
            System.out.println("F - feminino");
        } else if (input == 'm'){
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
 

        // if (input.equals("F")) { //if (input.equalsIgnoreCase("F")) {
        //     System.out.println("F - feminino");
        // } else if (input.equals("M")) {
        //     System.out.println("M - masculino");
        // } else {
        //     System.out.println("Sexo inválido");
        // }

        // scan.close();
    }


