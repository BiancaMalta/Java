import java.util.Scanner;

public class CobrancaLocacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o modelo do carro alugado:");
        String modeloCarro = scanner.nextLine();

        System.out.println("Digite o valor da diária para locação:");
        double valorDiaria = scanner.nextDouble();

        System.out.println("Digite a quantidade de dias de locação:");
        int quantidadeDias = scanner.nextInt();

        System.out.println("Digite a quantidade de Km percorridos:");
        int quantidadeKm = scanner.nextInt();

        // Cálculo do preço total
        double precoTotal = valorDiaria * quantidadeDias + (quantidadeKm * 0.20);

        // Saída de dados
        System.out.println("Modelo do carro alugado: " + modeloCarro);
        System.out.println("Valor total a pagar: R$" + precoTotal);

        scanner.close();
    }
}
