import java.util.Scanner;
    public class quadrada{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o numero: ");
            int numero = scanner.nextInt();
            int quadrado = numero * numero;

            System.out.print("O quadrado do numero e :"+quadrado);
            scanner.close();
        }
    }