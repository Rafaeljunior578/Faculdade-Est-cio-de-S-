import java.util.Scanner;

    public class Conversor{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);            
                double taxaParaDolar = 0.20;
                double taxaParaEuro = 0.18;

                System.out.println("===Conversor de Real para dolar e Euro===");
                    System.out.println("Digite o valor em reais(BRL)");
                    double valorEmReais = scanner.nextDouble();

                    System.out.println("Deseja converter para (Dolar/Euro):");
                    String destino = scanner.next().toLowerCase();

                    double resultado = 0.0;

                    if (destino.equals("dolar")){
                        resultado = valorEmReais * taxaParaDolar;
                        System.out.printf("R$ %.2f equivalem a %.2f\n", valorEmReais, resultado);
                    }else if(destino.equals("euro")){
                        resultado = valorEmReais * taxaParaEuro;
                        System.out.printf("R$ %.2f equivalemte a %.2f\n",valorEmReais, resultado);
                    }else{
                        System.out.printf("Moeda invalida. digite dolar ou euro.");
                    }
                    scanner.close();
            
        } 
}