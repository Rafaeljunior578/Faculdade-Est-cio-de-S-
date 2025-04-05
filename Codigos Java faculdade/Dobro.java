import java.util.Scanner;
    public class Dobro{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite um numero inteiro: ");
            int numero = scanner.nextInt();

            int dobro = numero * 2;

            System.out.println("O dobro do numero "+numero+" e "+dobro);
            scanner.close();
        }      
        
    }