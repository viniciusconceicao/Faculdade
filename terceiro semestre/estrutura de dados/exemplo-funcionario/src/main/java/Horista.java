public class Horista extends Funcionario{

    //Atributos
    private Integer qtdHora;
    private Double valorHora;

    //Construtor

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }


    //Métodos
    //Implementação do método abstrato calcSalario
    @Override
    public Double calcSalario() {
        return qtdHora*valorHora;
    }

    //Método toString


    @Override
    public String toString() {
        return "\nHorista" +
                "\nQuantidade de horas: " + qtdHora +
                "\nValor hora: " + valorHora +
                super.toString();
    }
}
