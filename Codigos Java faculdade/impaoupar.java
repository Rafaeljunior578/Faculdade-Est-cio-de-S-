import java.util.Scanner;

    public class impaoupar {
        public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
                System.out.print("Digite um numero inteiro: ");
                int numero = scanner.nextInt();

                if(numero % 2 == 0){
                    System.out.print("O numero " + numero + " e par");
                }else{
                    System.out.print("O numero "+ numero +" e impar");
                }
                scanner.close();
        }
    }