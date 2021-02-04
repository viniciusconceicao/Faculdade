

public abstract class Funcionario {

    //Atributos
    private String cpf;
    private String nome;

    //Construtor

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //Metodos
    //Metodo abstrato calcSalario
    public abstract Double calcSalario();

    //Metodo toString

    @Override
    public String toString() {
        return "\n\nFuncionário" +
                "\nCPF: " + cpf+
                "\nNome" + nome;
    }
}
