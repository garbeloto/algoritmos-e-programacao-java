package estudos;

import java.util.Scanner;

public class exer01 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notas = new double[10];
        double[] mediaTurma = new double[notas.length];

        for (int i=0;i<notas.length;i++){
            System.out.println("Entre com a nota 1 do Aluno "+(i+1)+":");
            notas[i] = scan.nextDouble();
        }
        System.out.println("Notas = ");
        for(int i=0;i<notas.length;i++){
            System.out.println(notas[i]);
        }  
        System.out.println();
        System.out.println("");
        for (int i=0;i<notas.length;i++){
            mediaTurma[i] = (notas[i]/i);
            if (mediaTurma[i] >=7){
                System.out.println("Média:"+ m[i]+" - Aprovado");
            }else {
                System.out.println("Média:"+resultados[i]+" - Reprovado");
            }
        }

    }
}
