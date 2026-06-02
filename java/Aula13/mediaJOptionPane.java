package Aula13;

import javax.swing.JOptionPane;

public class mediaJOptionPane {
    
    public static void main(String[] args) {
        
        int resposta = JOptionPane.showConfirmDialog(null,"Deseja calcular a média do aluno?");
        JOptionPane.showMessageDialog(null, resposta);

        if (resposta == 0) {
            String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno.");

            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));

            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

            double media = (nota + nota2 + nota3) / 3;

            JOptionPane.showMessageDialog(null, "Aluno: " + nomeAluno + "\n Media: " + media);
        }
    }
}
