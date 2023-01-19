package data;

import model.Pessoa;

import java.lang.reflect.Array;

public class ListaDePessoas {

    private Pessoa[] listaDePessoas = new Pessoa[10];



    public ListaDePessoas() {
        this.listaDePessoas[0] = new Pessoa("Pedro", 'M', 1.77);
        this.listaDePessoas[1] = new Pessoa("Larissa", 'F', 1.67);
        this.listaDePessoas[2] = new Pessoa("Lucas", 'M', 1.99);
        this.listaDePessoas[3] = new Pessoa("Camila", 'F', 1.60);
        this.listaDePessoas[4] = new Pessoa("João", 'F', 1.75);
        this.listaDePessoas[5] = new Pessoa("Maria", 'F', 1.65);
        this.listaDePessoas[6] = new Pessoa("Henrique", 'M', 1.80);
        this.listaDePessoas[7] = new Pessoa("Juliana", 'F', 1.68);
        this.listaDePessoas[8] = new Pessoa("Rafael", 'M', 1.73);
        this.listaDePessoas[9] = new Pessoa("Ana", 'F', 1.50);
    }

    public Pessoa[] getListaDePessoas() {
        return listaDePessoas;
    }

    public void setListaDePessoas(Pessoa[] listaDePessoas) {
        this.listaDePessoas = listaDePessoas;
    }
}