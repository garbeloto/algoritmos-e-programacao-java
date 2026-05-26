package ExerciciosJava01;
import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos reais você ganha por hora: ");
        Double salarioHora = scan.nextDouble();

        System.out.println("Informe o número de horas trabalhadas por mês: ");
        Double horaMes = scan.nextDouble();

        Double salarioBrutoMes = salarioHora * horaMes;
        Double impostoRenda = salarioBrutoMes * 0.11;
        Double impostoInss = salarioBrutoMes * 0.08;
        Double impostoSindicato = salarioBrutoMes * 0.05;

        Double descontos = impostoRenda + impostoInss + impostoSindicato;

        Double salarioLiquido = salarioBrutoMes - descontos;

        System.out.println("Salario bruto: R$" + salarioBrutoMes);
        System.out.println("Imposto de Renda: R$" + impostoRenda);
        System.out.println("Imposto pago ao INSS: R$" + impostoInss);
        System.out.println("Imposto pago ao Sindicato: R$" + impostoSindicato);
        System.out.println("Total salário líquido: R$" + salarioLiquido);

    }
}
