package ExerciciosJava03;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        
        double totalCompra = 0;
        int contadorProduto = 1;

        System.out.println("Digite o valor do produto " + contadorProduto +  ": R$");
        double valorProduto = scan.nextDouble();

        while (valorProduto != 0) {
            totalCompra += valorProduto;
            contadorProduto++;

            System.out.println("Digite o valor do produto " + contadorProduto +  ": R$");
            valorProduto = scan.nextDouble();
        }
        System.out.println("Total da compra: R$" + totalCompra);

        System.out.println("Digite o valor recebido: R$");
        double valorRecebido = scan.nextDouble();

        if (valorRecebido >= totalCompra) {
            double troco = valorRecebido - totalCompra;
            System.out.println("Troco: R$" + troco);
        } else {
            System.out.println("Valor insuficiente para pagamento!");
        }
    }
}
