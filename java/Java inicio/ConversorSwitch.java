import java.util.Scanner;

public class ConversorSwitch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            double taxaParaDolar = 0.20;
            double taxaParaEuro = 0.18;

            System.out.println("====Conversor de moedas usando switch ====");

            System.out.print("Digite o valor em reais(BRL)");
            double valorEmReais = scanner.nextDouble();
            System.out.print("Deseja converter para (Dolar/euro)");
            String destino = scanner.next().toLowerCase();

            double resultado;

            switch (destino) {
                case "euro":
                    resultado = valorEmReais * taxaParaEuro;
                    System.out.printf("R$ %.2f equivalem a € %.2f\n",valorEmReais, resultado);//%.2f tipo de dado double/float
                    
                    break;
                case "dolar":
                    resultado = valorEmReais * taxaParaDolar;
                    System.out.printf("R$ %.2f equivalem a US$ %.2f\n",valorEmReais, resultado);
                break;
            
                default:
                    System.out.printf("Moeda invalida digite euro ou dolar");
                    break;
            }
            scanner.close();

    }
}