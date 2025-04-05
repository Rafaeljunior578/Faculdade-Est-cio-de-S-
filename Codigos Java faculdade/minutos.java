import java.util.Scanner;
    public class minutos{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a quantidade de minutos:");
            int minutos = scanner.nextInt();
            int segundos = 60 * minutos;
            System.out.print(minutos + " minutos equivalem a " + segundos + " segundos.");
            scanner.close();
        }
    }