package AvaliacaoJava;

import java.util.Scanner;

public class Questao02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite o tipo de usuario: (admin, usuario, visitante)");
        String usuario = scan.next();

        System.out.println("Digite sua senha: ");
        String senha = scan.next();


        if (usuario.equals("admin") && senha.equals("1234") ) {
            System.out.println("Bem-vindo (a) " + nome);

        } else if (usuario.equals("usuario") && senha.equals("2222") ) {
            System.out.println("Bem-vindo (a) " + nome);

        } else if (usuario.equals("visitante") && senha.equals("3333") ) {
            System.out.println("Bem-vindo (a) " + nome);
        } else {
            System.out.println("Usuário ou senha inválidos");
        }
    }
}
