package Aula15;

import java.util.Scanner;

public class OperadorTernario {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double nota = 6;

        /* 
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado!");
        }
            */

        //System.out.println(nota >= 7? "Aprovado":"Reprovado");

        String resultado = (nota >=7? "Aprovado":"Reprovado");
        System.out.println("Resultado:" + resultado);
        
    }
}
