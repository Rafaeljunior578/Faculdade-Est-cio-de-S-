import java.util.Scanner;
    public class raiz{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o numero ");
            int numero = scanner.nextInt();

            System.out.print("A raiz do numero "+numero+" e "+  Math.sqrt(numero));
            scanner.close();
        }
    }