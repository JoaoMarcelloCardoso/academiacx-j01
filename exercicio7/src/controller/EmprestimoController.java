package controller;

import model.Emprestimo;
import model.Livro;
import model.Pessoa;
import repository.LivroRepository;
import repository.PessoaRepository;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoController {
    private LivroRepository livroRepository;
    private PessoaRepository pessoaRepository;
    private List<Emprestimo> emprestimos;
    public EmprestimoController() {
        this.livroRepository = new LivroRepository();
        this.pessoaRepository = new PessoaRepository();
        this.emprestimos = new ArrayList<>();
    }

    public void emprestarLivro(int idLivro, int idPessoa) {
        Livro livro = livroRepository.getLivroById(idLivro);
        Pessoa pessoa = pessoaRepository.getPessoaById(idPessoa);

        if (livro != null && pessoa != null) {
            Emprestimo emprestimo = new Emprestimo(livro, pessoa);
            emprestimos.add(emprestimo);
            livroRepository.removeLivro(livro);
            System.out.println("---------------------------------");
            System.out.println(livro.getNome() + " foi emprestado para " + pessoa.getNome());
            System.out.println("---------------------------------");
        }

    }

    public void devolverLivro(int idEmprestimo){
        Emprestimo emprestimo = emprestimos.get(idEmprestimo);
        if (emprestimo != null){
            livroRepository.addLivro(emprestimo.getLivro());
            emprestimos.remove(idEmprestimo);
        }
    }





    public void imprimirPessoas(){
        System.out.println("Lista de Pessoas cadastradas");
        for (Pessoa pessoa: pessoaRepository.getListaDePessoas()){
            System.out.println("-------------------------------");
            System.out.println("ID: "+pessoa.getId());
            System.out.println("Nome: "+pessoa.getNome());
            System.out.println("-------------------------------");
        }
    }

    public void imprimirLivros(){
        System.out.println("Lista de Livros cadastrados");
        for (Livro livro: livroRepository.getListaDeLivros()){
            System.out.println("-------------------------------");
            System.out.println("ID: "+livro.getId());
            System.out.println("Nome: "+livro.getNome());
            System.out.println("-------------------------------");
        }
    }

    public void imprimirEmprestimos(){
        System.out.println("Lista de Emprestimos");
        if (emprestimos.size() == 0){
            System.out.println("Nenhum empréstimo foi feito");
        }
        for (Emprestimo emprestimo: emprestimos){
            System.out.println("---------------------------------");
            System.out.println("ID Empréstimo: " + emprestimo.getId());
            emprestimo.getPessoa().imprime();
            emprestimo.getLivro().imprime();
            System.out.println("Data de emprestimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Data de devolução: " + emprestimo.getDataDevolucao());
            System.out.println("---------------------------------");

        }
    }


}


