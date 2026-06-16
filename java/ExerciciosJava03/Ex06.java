package ExerciciosJava03;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        
        double totalCompra = 0;
        int contadorProduto = 1;
        double valorProduto;

        do {

            System.out.println("Digite o valor do produto " + contadorProduto +  ": R$");
            valorProduto = scan.nextDouble();

            if (valorProduto != 0 ) {
                totalCompra += valorProduto;

                contadorProduto++; 
            }

        } while (valorProduto != 0);
        
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
