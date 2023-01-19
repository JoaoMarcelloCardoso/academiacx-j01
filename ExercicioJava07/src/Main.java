import model.entities.Emprestimo;
import model.entities.Livro;
import model.entities.Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Emprestimo> emprestimos = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("\nBem vindo ao sistema de empréstimo de livros!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar pessoa");
            System.out.println("3 - Realizar empréstimo");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Listar livros disponíveis");
            System.out.println("6 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor do livro: ");
                    String autor = sc.nextLine();
                    System.out.print("Gênero do livro: ");
                    String genero = sc.nextLine();

                    Livro novoLivro = new Livro(titulo, autor, genero);
                    livros.add(novoLivro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    Pessoa novaPessoa = new Pessoa(nome, cpf, telefone);
                    pessoas.add(novaPessoa);
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 3:
                    System.out.print("Título do livro: ");
                    String tituloLivro = sc.nextLine();
                    System.out.print("Nome da pessoa: ");
                    String nomePessoa = sc.nextLine();

                    Livro livroEmprestado = null;
                    Pessoa pessoaEmprestimo = null;

                    for (Livro l : livros) {
                        if (l.getTitulo().equalsIgnoreCase(tituloLivro) && l.isDisponivel()) {
                            livroEmprestado = l;
                            break;
                        }
                    }

                    for (Pessoa p : pessoas) {
                        if (p.getNome().equalsIgnoreCase(nomePessoa)) {
                            pessoaEmprestimo = p;
                            break;
                        }
                    }
                    if (livroEmprestado != null && pessoaEmprestimo != null) {
                        Emprestimo novoEmprestimo = new Emprestimo(livroEmprestado, pessoaEmprestimo, LocalDate.now());
                        emprestimos.add(novoEmprestimo);
                        livroEmprestado.setDisponivel(false);
                        System.out.println("Empréstimo realizado com sucesso!");
                        System.out.println("Data do empréstimo: ");
                        System.out.println(fmt.format(novoEmprestimo.getDataEmprestimo()));

                    } else {
                        System.out.println("Livro ou pessoa não encontrados ou livro já emprestado.");
                    }
                    break;

                case 4:
                    System.out.print("Título do livro: ");
                    tituloLivro = sc.nextLine();
                    System.out.print("Nome da pessoa: ");
                    nomePessoa = sc.nextLine();

                    Livro livroDevolvido = null;
                    Pessoa pessoaDevolucao = null;
                    Emprestimo emprestimoDevolucao = null;


                    for (Livro l : livros) {
                        if (l.getTitulo().equalsIgnoreCase(tituloLivro) && !l.isDisponivel()) {
                            livroDevolvido = l;
                            break;
                        }
                    }

                    for (Pessoa p : pessoas) {
                        if (p.getNome().equalsIgnoreCase(nomePessoa)) {
                            pessoaDevolucao = p;
                            break;
                        }
                    }

                    for (Emprestimo e : emprestimos) {
                        if (e.getLivro().equals(livroDevolvido) && e.getPessoa().equals(pessoaDevolucao)) {
                            emprestimoDevolucao = e;
                            break;
                        }
                    }

                    if (livroDevolvido != null && pessoaDevolucao != null && emprestimoDevolucao != null) {
                        livroDevolvido.setDisponivel(true);
                        emprestimos.remove(emprestimoDevolucao);
                        System.out.println("Devolução realizada com sucesso!");
                        System.out.println("Data da devolução: ");
                        System.out.println(fmt.format(LocalDate.now()));
                    } else {
                        System.out.println("Livro, pessoa ou empréstimo não encontrados.");
                    }
                    break;
                case 5:
                    for (Livro l : livros) {
                        if (l.isDisponivel()) {
                            System.out.println(l);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}


