import java.util.Scanner;
    public class Calculadora{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o numero desejado: ");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo numero: ");
            int numero2 = scanner.nextInt();
            System.out.println("Escolha o operador - + / *");
            int operador = scanner.nextInt();
            
            if(operador = - ){
                System.out.println("A subtração dos numeros e "+numero1-numero2);
            }else if(operador = +){
                System.out.println("A soma dos numero e "+numero1+numero2);
            }else if(operador = /){
                System.out.println("A divisao dos numeros e "+numero1/numero2);
            }else{
                System.out.println("A multiplicação dos numeros e "+numero1*numero2);
            }

        }
    }