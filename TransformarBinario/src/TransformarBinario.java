import java.util.Scanner;

public class TransformarBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String binario = decimalParaBinario(numeroDecimal);

        System.out.println("O número binário correspondente é: " + binario);

        scanner.close();
    }

    // Método para converter decimal para binário
    public static String decimalParaBinario(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            int resto = decimal % 2;
            binario.insert(0, resto); // Insere o resto no início da string
            decimal /= 2;
        }

        return binario.toString();
    }
}
