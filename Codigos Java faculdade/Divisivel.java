import java.util.Scanner;
    public class Divisivel{
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um numero ");
            double numero = scanner.nextDouble();

            if (numero % 5 == 0){
                System.out.print("O numero e divisivel por 5");
            }else{
                System.out.print("O numero nao e divisivel por 5");
            }
            scanner.close();
        }
    }