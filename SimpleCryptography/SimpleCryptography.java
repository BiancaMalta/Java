import javax.swing.JOptionPane;

public class SimpleCryptography {
    public static void main(String[] args) {
        // Entrada da mensagem via JOptionPane
        String input = JOptionPane.showInputDialog("Digite a mensagem a ser criptografada:");

        // Separação dos caracteres
        char[] chars = input.toCharArray();
        StringBuilder step1 = new StringBuilder("1. Separação de caracteres:\n");
        for (char c : chars) {
            step1.append(c).append(" ");
        }
        JOptionPane.showMessageDialog(null, step1.toString());

        // Conversão para valores ASCII
        int[] asciiValues = new int[chars.length];
        StringBuilder step2 = new StringBuilder("2. Conversão para ASCII:\n");
        for (int i = 0; i < chars.length; i++) {
            asciiValues[i] = (int) chars[i];
            step2.append(asciiValues[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, step2.toString());

        // Soma 10 unidades para criptografia
        StringBuilder step3 = new StringBuilder("3. Soma 10 unidades (criptografia):\n");
        for (int i = 0; i < asciiValues.length; i++) {
            asciiValues[i] += 10;
            step3.append(asciiValues[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, step3.toString());

        // Conversão de volta para caracteres e exibição da mensagem final criptografada
        char[] encryptedChars = new char[asciiValues.length];
        for (int i = 0; i < asciiValues.length; i++) {
            encryptedChars[i] = (char) asciiValues[i];
        }
        String encryptedMessage = new String(encryptedChars);
        JOptionPane.showMessageDialog(null, "4. Saída da String final criptografada:\n" + encryptedMessage);
    }
}
