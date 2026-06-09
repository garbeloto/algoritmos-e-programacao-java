package Aula15;

import javax.swing.JOptionPane;

public class jOptionPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá, seja bemvindo!");

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        JOptionPane.showMessageDialog(null, "A soma dos números é: " + (numero1 + numero2));
    }
}
