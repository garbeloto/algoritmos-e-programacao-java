package ExerJava04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0;i<vetorA.length;i++){
            System.out.println("Entre com o valor na posição "+i+":" );
            vetorA[i]=scan.nextInt();
        }
        int soma=0;
        for(int i=0;i<vetorA.length;i++){
            soma+=vetorA[i];
        }
        System.out.println("Soma total: "+soma);

    }
}
