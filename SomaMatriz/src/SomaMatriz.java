import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class SomaMatriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Cria uma matriz 3x3 para armazenar os números inteiros
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        // Preenche a matriz com números inteiros fornecidos pelo usuário
        System.out.println("----------------- Bem-vindo, Paulo! -----------------");
        System.out.println("Utilize números inteiros para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Faz um loop até que o usuário forneça um número inteiro válido
                while (true) {
                    System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                    // Verifica se o próximo é um número inteiro
                    if (scanner.hasNextInt()) {
                        matriz[i][j] = scanner.nextInt(); // Armazena o número na matriz
                        break; // Sai do loop enquanto, pois o número é válido
                    } else {
                        System.out.println("Valor inválido! Por favor, digite um número inteiro.");
                        scanner.next(); // Limpa o buffer de entrada
                    }
                }
            }
        }

        // Calcula a soma de todos os elementos da matriz
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j]; // Adiciona cada elemento à soma
            }
        }

        // Exibe a matriz e a soma dos elementos
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d\t", matriz[i][j]); // Exibe cada elemento da matriz
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
        System.out.println("\nA soma de todos os elementos da matriz é: " + soma);
        System.out.println("----------------------- FIM -----------------------");
        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
