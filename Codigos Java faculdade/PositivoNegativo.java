import java.util.Scanner;
    public class PositivoNegativo{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Digite o numero: ");
            int numero = scanner.nextInt();
            if(numero < 0){
                System.out.println("Negativo");
            }else if(numero > 0){
                System.out.println("Positivo");
            }else{
                System.out.println("Zero");
            };
            scanner.close();
        }
    }