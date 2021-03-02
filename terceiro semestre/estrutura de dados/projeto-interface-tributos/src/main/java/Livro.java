public class Livro extends Produto{

    private String nome;
    private String autor;
    private String isbn;

    public Livro(Integer codigo, Double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    Double precoLivro = getPrecoCusto()*1.1;

    @Override
    public Double getValorVenda() {
        return precoLivro;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNome: "+ nome +
                "\nAutor: "+ autor +
                "\nISBN: "+ isbn +
                "\nPreço do livro mais impostos: "+ precoLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(Double precoLivro) {
        this.precoLivro = precoLivro;
    }
}
