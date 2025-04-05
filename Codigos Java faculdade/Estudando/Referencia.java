// Removida a importação desnecessária

// Classe Aluno (com letra maiúscula, como manda a convenção)
class Aluno {
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos para definir os valores
    public void definirNome(String nome) {
        this.nome = nome;
    }

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    // Método para recuperar o nome
    public String recuperarNome() {
        return this.nome;
    }
}

// Classe principal Referencia
public class Referencia {
    private Aluno a1, a2;

    // Construtor
    public Referencia() {
        a1 = new Aluno("Carlos", 20);
        a2 = new Aluno("Ana", 20);

        System.out.println("O nome do aluno a1 é: " + a1.recuperarNome());
        System.out.println("O nome do aluno a2 é: " + a2.recuperarNome());

        // Problema de referência: agora a2 aponta para o mesmo objeto que a1
        a1 = a2;
        a2.definirNome("Flávia"); // Isso também altera a1!

        System.out.println("O nome do aluno a1 é: " + a1.recuperarNome());

        manipularAluno(a1);

        System.out.println("O nome do aluno a1 é: " + a1.recuperarNome());
    }

    // Método para modificar o nome do aluno
    public void manipularAluno(Aluno aluno) {
        aluno.definirNome("Márcia"); // Modifica o objeto original
    }

    // Método principal (main)
    public static void main(String args[]) {
        Referencia r = new Referencia();
        System.out.println("Fim da execução");
    }
}
