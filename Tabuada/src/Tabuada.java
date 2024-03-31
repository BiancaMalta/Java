public class Tabuada {
    public static void main(String[] args) {
        for (int numero = 6; numero <= 10; numero++) { // Loop para cada número de 6 a 10
            System.out.println("Tabuada do " + numero + ":");

            for (int multiplo = 1; multiplo <= 10; multiplo++) { // Loop para cada múltiplo de 1 a 10
                int produto = numero * multiplo; // Calcula o produto do número atual com o múltiplo
                System.out.println(numero + " x " + multiplo + " = " + produto); // Exibe o produto
            }

            System.out.println(); // Adiciona uma linha em branco entre as tabuadas
        }
    }
}