import java.util.Scanner;

public class NumeroPositivoNegativo{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);//Cria um objeto para ler dados do usuáro

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();//Lê um numero inteiro digitado pelo usuario

        //Verifica se o número é positivou, negativo ou zero
        if (numero > 0){
            System.out.println("O número é positivo.");
        } else if (numero < 0){
            System.out.println("O número é negativo.");
        } else{
            System.out.println("O número é zero.");
        }
        scanner.close();//Fecha o scanner para liberar recursos
    }  
}