package com.example.projetojpa4.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class Filme {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String titulo;

    private String diretor;

    private String custoProducao;

    private LocalDate dataLancamento;

    private boolean classico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getCustoProducao() {
        return custoProducao;
    }

    public void setCustoProducao(String custoProducao) {
        this.custoProducao = custoProducao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public boolean isClassico() {
        return classico;
    }

    public void setClassico(boolean classico) {
        this.classico = classico;
    }
}
