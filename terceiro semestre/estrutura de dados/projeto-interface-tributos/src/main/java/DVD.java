public class DVD extends Produto{

    private String nome;
    private String gravadora;

    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    Double precoDVD = getPrecoCusto()*1.1;
    @Override
    public Double getValorVenda() {
        return precoDVD;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nNome DVD: "+ nome +
                "\nGravadora: "+ gravadora +
                "\nprecoDVD: "+ precoDVD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        gravadora = gravadora;
    }

    public Double getPrecoDVD() {
        return precoDVD;
    }

    public void setPrecoDVD(Double precoDVD) {
        this.precoDVD = precoDVD;
    }
}
