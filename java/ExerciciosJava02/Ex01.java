package ExerciciosJava02;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número para saber o maior");
        int n1 = scan.nextInt();

        System.out.println("Informe o segundo número para saber o maior");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " maior que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " maior que " + n1);
        } else {
            System.out.println("Operação inválida!");
        }


    }
}
