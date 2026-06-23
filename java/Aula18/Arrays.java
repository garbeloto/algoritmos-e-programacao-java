package Aula18;

import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);

        double[] temperaturas = new double[365];

        /* temperaturas[0]=14;
        temperaturas[1]=7.5;
        temperaturas[2]=7;
        temperaturas[3]=14.5;
        temperaturas[360]=40; */

       
        for (int i = 0; i < 15; i++) {
             System.out.println("Digite o valor da temperatura do dia " + (i + 1) + " : ");
             temperaturas[i]= scan.nextDouble();
        }
        for (int i = 0; i <= temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
        }

        for (double temp : temperaturas){
            System.out.println(temp);
        }

        
        
        /* 
        System.out.println("O valor da temperatura de dia 4 é: " + temperaturas[3]);

        System.out.println("O tamanho do array temperaturas é: " + temperaturas.length); //length para saber o tamanho do array
        */
    }
}
