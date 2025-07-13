import java.util.Scanner;
    public class media{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a primeira nota :");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            double nota = (nota1 + nota2 + nota3) / 3;
            
            System.out.printf("A media das 3 notas e de: " + nota);
            scanner.close();
        }
    }