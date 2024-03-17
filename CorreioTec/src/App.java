import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o valor total da compra
        System.out.println("Digite o valor total da compra:");
        double valorTotal = scanner.nextDouble();

        // Calcula o desconto com base no valor total da compra
        double desconto = calcularDesconto(valorTotal);
        
        // Calcula o valor total a ser pago pelo cliente após o desconto
        double valorTotalComDesconto = valorTotal - desconto;

        // Exibe o valor do desconto aplicado e o valor total a ser pago
        System.out.println("Desconto aplicado: R$" + desconto);
        System.out.println("Valor total a ser pago: R$" + valorTotalComDesconto);

        scanner.close();
    }

    // Método para calcular o desconto com base no valor total da compra
    public static double calcularDesconto(double valorTotal) {
        double desconto = 0;

        // Aplica as regras de desconto progressivo
        if (valorTotal < 200) {
            desconto = valorTotal * 0.05; // 5%
        } else if (valorTotal >= 200 && valorTotal < 300) {
            desconto = valorTotal * 0.10; // 10%
        } else if (valorTotal >= 300) {
            desconto = valorTotal * 0.15; // 15%
        }

        return desconto;
    }
}