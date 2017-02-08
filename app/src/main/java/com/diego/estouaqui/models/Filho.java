package com.diego.estouaqui.models;

/**
 * Created by Diego on 08/02/2017.
 */
public class Filho {

    private Long id;
    private String nome;
    private String nomeEscola;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Filho(Long id, String nome, String nomeEscola) {
        this.id = id;
        this.nome = nome;
        this.nomeEscola = nomeEscola;
    }

    public Filho() {}
}
