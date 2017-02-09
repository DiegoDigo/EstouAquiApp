package com.diego.estouaqui.models;

/**
 * Created by Diego on 09/02/2017.
 */
public class Motorista {

    private String nome;
    private String cidade;
    private String tipoVeiculo;
    private int lugar;
    private float rank;

    public Motorista() {

    }

    public Motorista(String nome, String cidade, String tipoVeiculo, int lugar, float rank) {
        this.nome = nome;
        this.cidade = cidade;
        this.tipoVeiculo = tipoVeiculo;
        this.lugar = lugar;
        this.rank = rank;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
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
