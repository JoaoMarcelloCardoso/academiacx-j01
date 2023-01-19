import models.Emprestimo;
import models.Livro;
import models.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<Livro>();
        livros.add(new Livro(1, "Memórias Póstumas de Brás Cubas"));
        livros.add(new Livro(2, "História do Brasil"));
        livros.add(new Livro(3, "Curso de Python"));
        livros.add(new Livro(4, "Java para Iniciantes"));
        livros.add(new Livro(5, "História do Mundo"));

        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("BIBLIOTECA MUNICIPAL: Sistema de Empréstimo de Livros");
            System.out.println("1 - Consultar livros já emprestados em certo nome");
            System.out.println("2 - Ver todos os livros e solicitar empréstimo");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome da pessoa: ");
                    String nome = scanner.next();
                    Pessoa pessoa = null;
                    for (Pessoa p : pessoas) {
                        if (p.getNome().equals(nome)) {
                            pessoa = p;
                            break;
                        }
                    }
                    if (pessoa != null) {
                        System.out.println("Livros emprestados para " + pessoa.getNome() + ":");
                        for (Emprestimo emprestimo : pessoa.getEmprestimos()) {
                            System.out.println(emprestimo.getLivro().getNome());
                        }
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
                case 2:
                    System.out.println("Livros disponíveis para empréstimo:");
                    for (Livro livro : livros) {
                        System.out.println(livro.getCodigo() + " - " + livro.getNome());
                    }
                    System.out.print("Informe o código do livro: ");
                    int codigoLivro = scanner.nextInt();
                    Livro livroEmprestimo = null;
                    for (Livro livro : livros) {
                        if (livro.getCodigo() == codigoLivro) {
                            livroEmprestimo = livro;
                            break;
                        }
                    }
                    if (livroEmprestimo != null) {
                        System.out.print("Informe o nome da pessoa: ");
                        nome = scanner.next();
                        pessoa = null;
                        for (Pessoa p : pessoas) {
                            if (p.getNome().equals(nome)) {
                                pessoa = p;
                                break;
                            }
                        }
                        if (pessoa == null) {
                            pessoa = new Pessoa(nome);
                            pessoas.add(pessoa);
                        }
                        Emprestimo emprestimo = new Emprestimo(livroEmprestimo, pessoa);
                        emprestimos.add(emprestimo);
                        pessoa.adicionarEmprestimo(emprestimo);
                        System.out.println("Empréstimo realizado com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}