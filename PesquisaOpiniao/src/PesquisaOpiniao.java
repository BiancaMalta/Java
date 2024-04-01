import java.util.Scanner;

public class PesquisaOpiniao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int excelente = 0; // Inicializa o contador de respostas "EXCELENTE"
        int ruim = 0; // Inicializa o contador de respostas "RUIM"

        // Loop para realizar a pesquisa com 50 entrevistados
        for (int i = 1; i <= 50; i++) {
            System.out.println("Entrevistado " + i + ":");

            // Solicita e armazena o nome do entrevistado
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            // Solicita e armazena a idade do entrevistado
            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine()); // Converte a entrada para inteiro

            // Solicita e armazena a opinião sobre o atendimento do entrevistado
            System.out.print("Opinião sobre o atendimento (1-EXCELENTE, 2-BOM, 3-RUIM): ");
            int opcao = Integer.parseInt(scanner.nextLine()); // Converte a entrada para inteiro

            // Verifica a opinião do entrevistado e atualiza os contadores
            if (opcao == 1) {
                excelente++; // Incrementa o contador de respostas "EXCELENTE"
            } else if (opcao == 3) {
                ruim++; // Incrementa o contador de respostas "RUIM"
            }
        }

        // Exibe o resultado da pesquisa
        System.out.println("\nResultado da pesquisa:");
        System.out.println("Quantidade de respostas \"EXCELENTE\": " + excelente);
        System.out.println("Quantidade de respostas \"RUIM\": " + ruim);

        scanner.close(); // Fecha o scanner
    }
}