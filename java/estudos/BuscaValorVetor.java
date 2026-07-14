package estudos;
import java.util.Scanner;

public class BuscaValorVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_PRODUTOS = 12;
        int[] codigos = new int[TOTAL_PRODUTOS];

        System.out.println("=== BUSCA DE PRODUTO NO ESTOQUE ===");
        System.out.println("Informe o codigo dos " + TOTAL_PRODUTOS + " produtos do estoque.\n");

        // ---- ENTRADA DE DADOS ----
        for (int i = 0; i < TOTAL_PRODUTOS; i++) {
            System.out.print("Codigo do produto " + (i + 1) + ": ");
            codigos[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o codigo do produto que deseja buscar: ");
        int codigoBuscado = scanner.nextInt();

        // ---- BUSCA ----
        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < TOTAL_PRODUTOS; i++) {
            if (codigos[i] == codigoBuscado) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        // ---- RELATORIO FINAL ----
        System.out.println("\n===== RELATORIO FINAL =====");

        System.out.println("\nCodigos cadastrados no estoque:");
        for (int i = 0; i < TOTAL_PRODUTOS; i++) {
            System.out.println("Posicao " + i + ": " + codigos[i]);
        }

        if (encontrado) {
            System.out.println("\nProduto " + codigoBuscado + " ENCONTRADO na posicao " + posicao + " do vetor.");
        } else {
            System.out.println("\nProduto " + codigoBuscado + " NAO encontrado no estoque.");
        }

        scanner.close();
    }
}
