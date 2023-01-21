package com.academiacx;

public class Livro {
    private int codigoLivro;
    private String nomeLivro;
    private String nomeAutor;

    public Livro() {

    }

    public Livro(int codigoLivro, String nomeLivro, String nomeAutor) {
        this.codigoLivro = codigoLivro;
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
}
