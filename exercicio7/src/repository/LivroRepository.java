package repository;

import model.Livro;
import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    List<Livro> listaDeLivros;

    public LivroRepository() {
        this.listaDeLivros = new ArrayList<>();
        this.listaDeLivros.add(new Livro("livro 1"));
        this.listaDeLivros.add(new Livro("livro 2"));
        this.listaDeLivros.add(new Livro("livro 3"));
        this.listaDeLivros.add(new Livro("livro 4"));
        this.listaDeLivros.add(new Livro("livro 5"));
        this.listaDeLivros.add(new Livro("livro 6"));
    }


    public Livro getLivroById(int idLivro) {
        return listaDeLivros.get(idLivro);
    }

    public void removeLivro(Livro livro){

        listaDeLivros.remove(livro);
    }

    public void addLivro(Livro livro){
        listaDeLivros.add(livro);
    }

    public List<Livro> getListaDeLivros() {
        return listaDeLivros;
    }
}
