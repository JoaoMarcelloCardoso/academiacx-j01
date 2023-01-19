package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private Integer matricula;

    private List<Double> notas = new ArrayList<>();

    public Aluno() {

    }
    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void addNota(double nota) {
        notas.add(nota);
    }

    public void removeNota(double nota){
        notas.remove(nota);
    }

    public double calcularMedia(){
        double soma = 0;
        for (double nota: notas ) {
            soma+= nota;
        }
        return soma / notas.size();
    }
}
