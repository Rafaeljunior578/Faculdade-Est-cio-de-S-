import java.util.Scanner;

    public class ConversorLoop{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            double taxaParaDolar = 0.20;
            double taxaParaEuro = 0.18;

            System.out.println("===Conversor com loop===");


            while (true) {
                System.out.print("\nDigite o valor em reais(BRL):");
                double valorEmReais = scanner.nextDouble();
    
                System.out.print("Digite a moeda euro dolar ou digite 'Sair' :");
                String destino = scanner.next().toLowerCase();

                if(destino.equals("sair")){
                    System.out.printf("Encerrando o conversor. Até mais!");
                    break;
                }
                double resultado;

                switch (destino) {
                    case "euro":
                        resultado = valorEmReais * taxaParaEuro;
                        System.out.printf("R$ %.2f equivalem a € %.2f\n",valorEmReais,resultado);                        
                        break;
                    
                    
                    case "dolar":
                    resultado = valorEmReais * taxaParaDolar;
                    System.out.printf("R$ %.2f equivalem a US$ %.2f\n",valorEmReais,resultado);
                    break;

                    default:
                    System.out.print("Moeda invalida, digite Euro, Dolar ou sair para encerrar o programa");
                        break;
                }
            }
            scanner.close();            
        }
    }