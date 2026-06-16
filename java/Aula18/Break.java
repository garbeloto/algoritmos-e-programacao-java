package Aula18;

import java.util.Scanner;

public class Break {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

    System.out.println("Entre com um número inicial: ");
    int num = scan.nextInt();

    System.out.println("Entre com um número limite: ");
    int max = scan.nextInt();

    for (int i = num; i <= max; i++) {
        System.out.println(i);
        
        if (i % 7 == 0) {
            continue;
        } System.out.println("O valor de i é: " + i);
    } 
            //break;
    }
}
