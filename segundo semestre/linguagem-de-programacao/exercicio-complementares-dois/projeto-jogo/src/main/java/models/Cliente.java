package models;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author vinic
 */
public class Cliente {
    
    private Long codigo;
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.codigo = ThreadLocalRandom.current().nextLong(100, 200);
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\n\nCliente" + 
                "\nCódigo: " + codigo + 
                "\nNome " + nome + 
                "\nCPF: " + cpf;
    }
    
    
    
    
    
}
