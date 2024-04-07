import java.util.Scanner;

public class CinemaSurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int capacidadeCinema = 40; // Capacidade máxima do cinema
        int otimoCount = 0; // Contador para respostas "ótimo"
        int ruimTotalIdade = 0; // Soma das idades das pessoas que responderam "ruim"
        int totalRespostas = 0; // Contador para o total de respostas coletadas
        int pessimoCount = 0; // Contador para respostas "péssimo"
        int ruimCount = 0; // Contador para respostas "ruim"

        System.out.println("Coleta de dados dos espectadores:");

        // Loop para coletar os dados de cada espectador até atingir a capacidade máxima do cinema
        while (totalRespostas < capacidadeCinema) {
            totalRespostas++; // Incrementa o total de respostas coletadas
            System.out.println("Espectador número " + totalRespostas); 
            System.out.println("Digite sua idade: ");
            int idade;
            while (true) {
                if (scanner.hasNextInt()) { // Verifica se a entrada é um número inteiro
                    idade = scanner.nextInt(); // Lê a idade do espectador
                    if (idade > 0 && idade <= 100) { // Verifica se a idade está dentro do intervalo
                        break; // Sai do loop se a idade for válida
                    } else {
                        System.out.println("Por favor, insira uma idade entre 1 e 100.");
                    }
                } else {
                    System.out.println("Por favor, insira um número inteiro.");
                    scanner.next(); // Limpa o buffer do scanner
                }
            }
            scanner.nextLine(); // Limpa o buffer do scanner

            // Solicita a opinião do espectador até receber uma entrada válida
            char opiniao;
            while (true) {
                System.out.println("Digite sua opinião: (A - Ótimo / B - Bom / C - Regular / D - Ruim / E - Péssimo):");
                String inputOpiniao = scanner.nextLine().toUpperCase(); // Lê a opinião do espectador e converte para maiúsculas
                if (inputOpiniao.length() == 1 && "ABCDE".contains(inputOpiniao)) { // Verifica se a entrada é um único caractere e se é A, B, C, D ou E
                    opiniao = inputOpiniao.charAt(0);
                    break; // Sai do loop se a entrada for válida
                } else {
                    System.out.println("Por favor, insira uma opinião válida (A, B, C, D ou E).");
                }
            }

            // Verifica a opinião do espectador e realiza as operações correspondentes
            if (opiniao == 'A') {
                otimoCount++; // Incrementa o contador para respostas "ótimo"
            } else if (opiniao == 'D') {
                ruimTotalIdade += idade; // Adiciona a idade à soma das idades das pessoas que responderam "ruim"
                ruimCount++; // Conta as respostas "ruim"
            } else if (opiniao == 'E') {
                pessimoCount++; // Conta as respostas "péssimo"
            }

        }

        // Calcula a média de idade das pessoas que responderam "ruim"
        double mediaIdadeRuim = ruimTotalIdade / (double) (ruimCount);

        // Calcula a porcentagem de respostas "péssimo"
        double percentualPessimo = (pessimoCount / (double) totalRespostas) * 100; // Calcula o percentual de respostas "péssimo" corretamente

        // Exibe os resultados na tela
        System.out.println("Quantidade de respostas 'Ótimo': " + otimoCount);
        System.out.printf("Média de idade das pessoas que responderam 'Ruim': %.2f\n", mediaIdadeRuim);
        System.out.printf("Porcentagem de respostas 'Péssimo': %.2f%%\n", percentualPessimo);

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}
