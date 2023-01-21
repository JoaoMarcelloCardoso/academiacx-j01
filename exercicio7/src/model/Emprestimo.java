package model;

import java.time.LocalDate;

public class Emprestimo {

    private String nomePessoa;
    private String livro;
    LocalDate dataEmprestimo;

    public Emprestimo(String nomePessoa, String livro, LocalDate dataEmprestimo) {
        this.nomePessoa = nomePessoa;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    @Override
    public String toString() {
        return "nomePessoa='" + nomePessoa + '\'' +
                ", livro='" + livro + '\'' +
                ", dataEmprestimo='" + dataEmprestimo + '\'';
    }
}
