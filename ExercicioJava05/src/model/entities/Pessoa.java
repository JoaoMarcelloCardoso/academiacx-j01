package model.entities;

import model.enums.Sexo;

public class Pessoa {
    private Double altura;
    private Sexo sexo;

    public Pessoa() {

    }

    public Pessoa(Double altura, Sexo sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
