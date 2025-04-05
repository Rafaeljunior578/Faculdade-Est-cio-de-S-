import java.util.Scanner;

public class SomaDoisNumeros{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        int numero1 = scanner.nextInt();//lê o primeiro número
        System.out.print("Digite o segundo número:");
        int numero2 = scanner.nextInt();//lê o segundo número
        System.out.print("Digite o terceiro numero");
        int numero3 = scanner.nextInt();//lê o terceiro número
        
        int soma = numero1 + numero2 + numero3;//calcula a soma dos tres numero

        System.out.println("A soma dos números é:"+ soma);//exibe a soma dos numeros

        scanner.close();
    }
}