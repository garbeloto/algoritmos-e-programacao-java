package AvaliacaoJava;

import java.util.Scanner;

public class Questao03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scan.next();

        System.out.println("Informe o curso desejado: \n 1- Banco de dados \n 2- Análise de dados \n 3- Inteligência Artificial \n 4- Segurança da Informação");
        int curso = scan.nextInt();


        System.out.println("Possui bolsa? 1- Sim, 0 - Não");
        int bolsa = scan.nextInt();

        System.out.println("Informe a forma de pagamento: \n 1- Pix \n 2- Cartâo \n 3- Boleto");
        int formaPag = scan.nextInt();

        int meses = 0;
        double valor= 0;

        double parcela = 0;
        double desconto = 0;
        double valorDesconto = 0;
        double parcelaTotal= 0;

        switch (curso) {
            case 1 : meses = 12;
                valor = 10900.00;
                System.out.println("Curso: Banco de dados");
            break;

            case 2 : meses = 10;
                valor = 8400.00; 
                System.out.println("Curso: Análise de dados"); 
            break;  

            case 3 : meses = 12;
                valor = 14400.00;
                System.out.println("Curso: Inteligência Artificial");
            break;

            case 4 : meses = 12;
                valor = 12600.00;
                System.out.println("Curso: Segurança da Informação");
            break;


            default: System.out.println("Curso Inválido");     
        }

        parcela = valor / meses;

        if (bolsa == 1) {
            desconto = 0.30;
            valorDesconto = parcela * desconto;
            parcelaTotal = parcela - valorDesconto;

            } else if (formaPag == 1) {
                desconto = 0.10;
                valorDesconto = parcela * desconto;
                parcelaTotal = parcela - valorDesconto;

            } else if (formaPag == 2) {
                desconto = 0;
                valorDesconto = parcela * desconto;
                parcelaTotal = parcela - valorDesconto;

            } else if (formaPag == 3) {
                desconto = 0.05;
                valorDesconto = parcela * desconto;
                parcelaTotal = parcela - valorDesconto;

        } else {
            System.out.println("Desconto não se aplica.");   
        } 

        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Parcela sem desconto: " + parcela);
        System.out.println("Percentual do desconto aplicado: " + desconto);
        System.out.println("Valor do desconto aplicado: " + valorDesconto);
        System.out.println("Valor final das parcelas com desconto: " + parcelaTotal);


    }
}
