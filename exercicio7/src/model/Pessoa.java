package model;

public class Pessoa {

    private String nome;
    private String cpf;
    private String celular;

    public Pessoa(String nome, String cpf, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "nome: '" + nome + '\'' +
                ", cpf: '" + cpf + '\'' +
                ", celular: '" + celular + '\'';
    }
}
