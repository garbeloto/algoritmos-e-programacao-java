package Aula17;

import java.util.Scanner;

public class WhileSenha {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a sua senha: ");
        int senha = scan.nextInt();

        while (senha != 1234) {
            System.out.println("Senha incorreta!");
            System.out.println("Digite novamente: ");
            senha = scan.nextInt();
        }

        System.out.println("Acesso permitido!");
    }
}
