// Classe pública deve ter o mesmo nome do arquivo
public class Escola {
    private Endereco endereco;
    private String nome;

    public Escola(String nome, String rua, int numero) {
        this.nome = nome;
        this.endereco = new Endereco(rua, numero);
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String rua, int numero) {
        this.endereco = new Endereco(rua, numero);
    }

    public void exibirInfo() {
        System.out.println("Escola: " + nome);
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero());
    }
}

// Classe secundária (não pode ser pública)
class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public class Main {
        public static void main(String[] args) {
            // Criando um objeto Escola
            Escola escola = new Escola("Colégio Alpha", "Rua das Flores", 123);
    
            // Exibindo informações
            escola.exibirInfo();
    
            // Modificando endereço
            escola.setEndereco("Avenida Brasil", 456);
            System.out.println("\nApós mudança de endereço:");
            escola.exibirInfo();
        }
    }
}
class aluno{
    //Atributos
    private string nome;
    private int idade;
    //Metodos
    public aluno(String nome, int idade){
    this.nome = nome;
    this.idade = idade;    
    }
    public void definirNome(String nome ){
        this.nome = nome;
    }
    public void definirIdade(int idade){
        this.idade = idade;
    }
    public string recuperarnome(){
        return this.nome;
    }
}   
    

