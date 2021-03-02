public abstract class Aluno {
    //Atributos
    private Integer ra;
    private String nome;

    //Construtor
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    //Métodos
    public abstract Double calculaMedia();

    //toString
    @Override
    public String toString() {
        return "Aluno " +
                "\nRA: " + ra +
                "\nNome: " + nome;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
