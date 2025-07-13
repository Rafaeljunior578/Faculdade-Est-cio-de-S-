import java.util.Scanner;

public class MaiorOuMenorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 100) {
            System.out.println("Digite a idade certa");
        } else if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        scanner.close();
    }
}
