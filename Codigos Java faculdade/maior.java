import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Verifica qual é o maior número
        int maior = num1; // Assume que o primeiro número é o maior

        if (num2 > maior) {
            maior = num2; // Se num2 for maior, atualiza o valor
        }
        if (num3 > maior) {
            maior = num3; // Se num3 for maior, atualiza o valor
        }

        // Exibe o maior número
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
