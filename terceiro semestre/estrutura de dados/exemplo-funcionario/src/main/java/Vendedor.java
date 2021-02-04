public class Vendedor extends Funcionario{

    //Atributos
    private Double vendas;
    private Double taxa;

    //Construtor

    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }


    //Métodos
    //Implementação do método abstrato calcSalario
    @Override
    public Double calcSalario() {
        return vendas * taxa;
    }

    //Método toString

    @Override
    public String toString() {
        return "\nVendedor" +
                "\nVendas: " + vendas +
                "\nTaxa: " + taxa+
                super.toString();
    }
}
