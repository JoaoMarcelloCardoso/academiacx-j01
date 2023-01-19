package models;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<Emprestimo> emprestimos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }
}