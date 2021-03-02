public class Servico implements Vendavel{

    private String descricao;
    private Integer codigo;
    private Double qtdHoras;
    private Double valorHora;

    public Servico(String descricao, Integer codigo, Double qtdHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }




    @Override
    public Double getValorVenda() {
        return qtdHoras*valorHora;
    }

    @Override
    public String toString() {
        return "\n\nServico" +
                "\nDescrição: " + descricao +
                "\nCódigo: " + codigo +
                "\nQuantidade de horas: " + qtdHoras +
                "\nValor hora: " + valorHora+
                "\nPreço do Serviço: "+ getValorVenda();
    }
}
