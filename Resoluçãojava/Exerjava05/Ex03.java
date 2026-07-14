package Exerjava05;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();

        int[][] numerosAleatorios = new int[10][10];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                
                numerosAleatorios[i][j]= aleatorio.nextInt(100);
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j]+" ");
            }
            System.out.println();
        }

        int maiorL5 =0;
        int menorL5 =999;
        int linha5 = 5;

        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
            if (numerosAleatorios[linha5][i] > maiorL5) {
                maiorL5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorL5) {
                menorL5 = numerosAleatorios[linha5][i];
            }
        }
        int maiorC7 =0;
        int menorC7 =999;
        int col7 = 7;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (numerosAleatorios[i][col7] > maiorC7) {
                maiorC7 = numerosAleatorios[i][col7];
            }
            if (numerosAleatorios[i][col7] < menorC7) {
                menorC7 = numerosAleatorios[i][col7];
            }
        }

        System.out.println("Maior valor da linha 5 = "+maiorL5);
        System.out.println("Menor valor da linha 5 = "+menorL5);
        System.out.println("Maior valor da coluna 7 = "+maiorC7);
        System.out.println("Menor valor da coluna 7 = "+menorC7);

    }
}
