package model;

public class Pessoa {
    private String nome;
    private char sexo;
    private Double altura;

    public Pessoa(String nome, char sexo, Double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
