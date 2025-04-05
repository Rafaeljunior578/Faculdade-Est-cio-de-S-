import java.util.Scanner;

public class AnoBissexto{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano:");
        int ano = scanner.nextInt();// lê p amp do usuário

        //verifica se o ano é divisível por 4, mas nao por 100, ou se e divisivel por 400
        if ((ano % 4 ==  0 && ano % 100 != 0)|| (ano % 400 == 0)){
            System.out.println("O ano "+ ano + " é bissexto.");
        }else{
            System.out.println("O ano "+ ano + " não é bissextor.");
        }
        scanner.close();
    }
}