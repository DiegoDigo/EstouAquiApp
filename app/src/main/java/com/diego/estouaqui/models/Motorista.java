package com.diego.estouaqui.models;

/**
 * Created by Diego on 09/02/2017.
 */
public class Motorista {

    private String nome;
    private String cidade;
    private float rank;

    public Motorista() {

    }

    public Motorista(float rank, String nome, String cidade) {
        this.rank = rank;
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }
}
