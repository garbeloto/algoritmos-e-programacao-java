package Matrizes;

public class Matrizes {
    
    public static void main(String[] args) {
        
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0]=10;
        notasAlunos[0][1]=7;
        notasAlunos[0][2]=9;
        notasAlunos[0][3]=9.5;

        notasAlunos[1][0]=9;
        notasAlunos[1][1]=8;
        notasAlunos[1][2]=7;
        notasAlunos[1][3]=6;

        notasAlunos[2][0]=8;
        notasAlunos[2][1]=9;
        notasAlunos[2][2]=10;
        notasAlunos[2][3]=7;

        for(int i=0; i < notasAlunos.length; i++){
            //System.out.println(notasAlunos[i]);

            for (int j = 0; j < notasAlunos[i].length; j++) { //notasAlunos[i].length coluna
                System.out.println(notasAlunos[i][j]);
            }
        }

        //double[] notasAluno1 = new double[3];

        //double[] notasAluno1 = {8,5,6,7,8};
        //double[][] notasAlunos = {{0,0},{5,4,8,9}};

        double soma;

        for (int i = 0; i < notasAlunos.length; i++) { //.length linhas
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno: " + i + " = " + (soma/4));
        }

        



    }
}
