// Importando a classe Scanner
import java.util.Scanner;

public class ControleIPVA {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário que insira o número final da placa do veículo
        System.out.println("Digite o número final da placa do veículo:");
        
        // Lendo o número fornecido pelo usuário
        int finalPlaca = scanner.nextInt();
        
        // Verificando se o número está entre 0 e 9
        if (finalPlaca >= 0 && finalPlaca <= 9) {
            // Usando a estrutura de controle switch para determinar o mês de vencimento do IPVA
            switch (finalPlaca) {
                case 1:
                    System.out.println("Pagamento do IPVA até 30/04");
                    break;
                case 2:
                    System.out.println("Pagamento do IPVA até 31/05");
                    break;
                case 3:
                    System.out.println("Pagamento do IPVA até 30/06");
                    break;
                case 4:
                    System.out.println("Pagamento do IPVA até 31/07");
                    break;
                case 5:
                    System.out.println("Pagamento do IPVA até 31/08");
                    break;
                case 6:
                    System.out.println("Pagamento do IPVA até 30/09");
                    break;
                case 7:
                    System.out.println("Pagamento do IPVA até 31/10");
                    break;
                case 8:
                    System.out.println("Pagamento do IPVA até 30/11");
                    break;
                case 9:
                case 0:
                    System.out.println("Pagamento do IPVA até 31/12");
                    break;
            }
        } else {
            // Se o número não estiver entre 0 e 9
            System.out.println("Valor digitado está incorreto. Por favor, digite um número entre 0 e 9.");
        }
        
        // Fechando o Scanner
        scanner.close();
    }
}