package Aula17;

public class LoopWhile {
    
    public static void main(String[] args) {
        
        int i = 1; //índice
        int max = 10; // máximo

        System.out.println("Contando até " + max + ": ");

        /* while (i <= 10) {
            System.out.println("Valor de i: " + i);
            i ++;
        } */

        do {
            i++;
            System.out.println("Valor de i: " + i);
            
        } while (i < 13);


    }
}
