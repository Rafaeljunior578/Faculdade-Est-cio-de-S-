import java.util.Scanner;
    public class multiplo{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número: ");
            int numero = scanner.nextInt();
            if (numero % 3 == 0 ){
                System.out.println("O número é múltiplo de 3 ");
            }else{System.out.println("o número nao é múltiplo de 3 ");}
            scanner.close();
        }
    }