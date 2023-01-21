package com.academiacx;

public class Pessoa {

    private String nomePessoa;
    private String celular;

    public Pessoa() {

    }

    public Pessoa(String nomePessoa, String celular) {
        this.nomePessoa = nomePessoa;
        this.celular = celular;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
