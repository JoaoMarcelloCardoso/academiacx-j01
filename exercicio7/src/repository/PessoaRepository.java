package repository;

import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepository {
    List<Pessoa> listaDePessoas;

    public PessoaRepository() {
        this.listaDePessoas = new ArrayList<>();
        this.listaDePessoas.add(new Pessoa("joão"));
        this.listaDePessoas.add(new Pessoa("pedro"));
        this.listaDePessoas.add(new Pessoa("julia"));
        this.listaDePessoas.add(new Pessoa("natasha"));
        this.listaDePessoas.add(new Pessoa("mateus"));
        this.listaDePessoas.add(new Pessoa("silvia"));
    }

    public Pessoa getPessoaById(int idPessoa) {
        return listaDePessoas.get(idPessoa);
    }

    public List<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }
}
