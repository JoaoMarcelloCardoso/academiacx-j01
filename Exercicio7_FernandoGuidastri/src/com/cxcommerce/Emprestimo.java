package com.cxcommerce;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private List<Pessoa> pessoas;

    public void exibirPessoas(){
        for (int i = 0; i < getPessoas().size(); i++)
        {
            Pessoa pessoa = getPessoas().get(i);
            System.out.println();
            System.out.println();

            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Telefone: " + pessoa.getTelefone());
            System.out.println();
        }



    }

    public List<Pessoa> getPessoas(){
        if (this.pessoas == null)
            this.pessoas = new ArrayList<>();

        return this.pessoas;


    }

    public void adicionarPessoa(Pessoa pessoa){
        getPessoas().add(pessoa);

    }

    public void remover(String telefone) {
        if (getPessoas().size() > 0) {
            for (int i = 0; i < getPessoas().size(); i++) {
                if (telefone.equalsIgnoreCase(pessoas.get(i).getTelefone())) {
                    pessoas.remove(i);
                    break;
                }
            }

        }
    }
    List<Livro> livros;

    public void exibirLivros(){
        for (int i = 0; i < getLivros().size(); i++)
        {
            Livro livro = getLivros().get(i);
            System.out.println();
            System.out.println();

            System.out.println("Nome: " + livro.getNome());
            System.out.println("Codigo do livro: " + livro.getCodigo());
            System.out.println();
        }



    }

    public List<Livro> getLivros(){
        if (this.livros == null)
            this.livros = new ArrayList<>();

        return this.livros;


    }

    public void adicionarLivro(Livro livro){
        getLivros().add(livro);

    }

    public void removerLivros(String codigo){
        if (getLivros().size() > 0) {
            for (int i = 0; i < getLivros().size(); i++) {
                if (codigo.equalsIgnoreCase(pessoas.get(i).getTelefone())) {
                    pessoas.remove(i);
                    break;
                }
            }

        }


    }


}