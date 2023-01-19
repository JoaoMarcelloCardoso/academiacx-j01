package com.academiacx.model;

import java.util.Date;

public class Emprestimo {

    private Pessoa pessoa;
    private Livro livro;
    private Date data;
    private boolean emprestado;

    public Emprestimo() {

    }

    public Emprestimo(Pessoa pessoa, Livro livro, Date data) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.data = data;
        this.emprestado = true;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
