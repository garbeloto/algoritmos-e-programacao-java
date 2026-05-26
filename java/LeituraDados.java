import java.util.Scanner;

public class LeituraDados {
    
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = scan.nextDouble();

        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos." + " Minha altura é: " + altura + " m");
    }
}
