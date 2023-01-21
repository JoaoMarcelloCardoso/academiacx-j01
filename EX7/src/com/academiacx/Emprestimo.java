package com.academiacx;
import java.util.*;

public class Emprestimo {

    private final List<Livro> livros;
    private final List<Pessoa> pessoas;

    public Emprestimo(){
        livros = new ArrayList<>();
        pessoas = new ArrayList<>();
    }

    public void fazerEmprestimo(int codigoLivro, String nomeLivro, String nomeAutor,
                                String nomePessoa, String celular){
        Livro novoL = new Livro(codigoLivro, nomeLivro, nomeAutor);
        livros.add(novoL);
        Pessoa novoP = new Pessoa(nomePessoa, celular);
        pessoas.add(novoP);
    }

    public void devolverLivro(String nome, int codigo){
        for (int i = 0; i < pessoas.size(); i++) {
            if(pessoas.get(i).getNomePessoa().equals(nome) && codigo == livros.get(i).getCodigoLivro()){
                pessoas.remove(i);
                livros.remove(i);
            }
        }
    }

    public void consultar(){
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("\n====================================");
            System.out.println("Codigo: " + livros.get(i).getCodigoLivro()
                    + "| Livro - " + livros.get(i).getNomeLivro()
                    + " | Autor - " + livros.get(i).getNomeAutor());
            System.out.println(pessoas.get(i).getNomePessoa()
                    + " pegou esse livro - Contato: " + pessoas.get(i).getCelular());
            System.out.println("====================================");
        }
    }

}
