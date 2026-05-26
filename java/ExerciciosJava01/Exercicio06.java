package ExerciciosJava01;
import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Fahrenheit para saber em graus Celsius");
        Double temperatura = scan.nextDouble();

        Double conversor = (5 * (temperatura - 32) / 9);

        System.out.println("Temperatura convertida par graus Celsius: " + conversor);
        
    }
}
