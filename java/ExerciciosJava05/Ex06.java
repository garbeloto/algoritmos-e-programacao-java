import java.util.Scanner;

public class Ex06{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultados = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++){
            System.out.println("Entre com a nota 1 do aluno1: ");
            notas1[i] = scan.nextDouble();

            System.out.println("Entre com a nota 2 do aluno1: ");
            notas2[i] = scan.nextDouble();

            resultados[i] = ((notas1[i] + notas2[i]) / 2);
            
        }

        System.out.println("Nota 1= ");
        System.out.println(notas1[1]);
    }
}