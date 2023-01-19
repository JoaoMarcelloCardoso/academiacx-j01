package com.academiacx;

import com.academiacx.model.Emprestimo;
import com.academiacx.model.Livro;
import com.academiacx.model.Pessoa;

import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    private static final List<Livro> listaDeLivros = new ArrayList<>();
    private static final List<Pessoa> listaDePessoas = new ArrayList<>();
    private static final List<Emprestimo> listaDeEmprestimos = new ArrayList<>();

    public static void main(String[] args) {
        cadastrarLivros();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Ver lista de pessoas cadastradas");
            System.out.println("3. Ver lista de livros cadastrados");
            System.out.println("4. Emprestar livro");
            System.out.println("5. Devolver livro");
            System.out.println("6. Consultar histórico de empréstimos");
            System.out.println("7. Sair do programa");

            try {
                System.out.print("Selecione a opção desejada: ");
                opcao = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("\nOpção inválida!\n");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
                    listarLivros();
                    break;
                case 4:
                    emprestarLivro();
                    break;
                case 5:
                    devolverLivro();
                    break;
                case 6:
                    consultarHistoricoEmprestimos();
                    break;
                case 7:
                    System.out.println("\nPrograma encerrado!");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
            }

        } while (opcao != 7);
    }


    private static void cadastrarLivros() {
        listaDeLivros.add(new Livro("Clean Code", "Robert C. Martin"));
        listaDeLivros.add(new Livro("Refactoring", "Martin Fowler"));
        listaDeLivros.add(new Livro("Domain-Driven Design", "Eric Evans"));
        listaDeLivros.add(new Livro("Clean Architecture", "Robert C. Martin"));
        listaDeLivros.add(new Livro("Learning Java", "Patrick Niemeyer"));
    }

    private static void cadastrarPessoa() {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("\nInsira o nome da pessoa: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("\nInsira o endereço de e-mail para contato: ");
        pessoa.setEmail(scanner.nextLine());

        listaDePessoas.add(pessoa);
        System.out.println("\n" + pessoa.getNome() + " foi adicionado(a) com sucesso!\n");
    }

    private static void listarPessoas() {
        if (listaDePessoas.isEmpty()) {
            System.out.println("\nNão existe nenhuma pessoa cadastrada no sistema!\n");
            return;
        }

        System.out.println("\n\nLista de pessoas cadastradas no sistema:");
        int i = 0;
        for (Pessoa pessoa : listaDePessoas) {
            i++;
            System.out.println(i + ". " + pessoa.getNome() + " - " + pessoa.getEmail());
        }
    }

    private static void listarLivros() {
        System.out.println("\n\nLista de livros:");

        int i = 0;
        for (Livro livro : listaDeLivros) {
            i++;

            String status = "DISPONÍVEL";

            for (Emprestimo emprestimo : listaDeEmprestimos) {
                if (emprestimo.isEmprestado() && emprestimo.getLivro().equals(livro)) {
                    status = "EMPRESTADO";
                }
            }

            System.out.println(i + ". " + livro.getTitulo() + " - de " + livro.getAutor() + " - Status: " + status);
        }
    }

    private static void emprestarLivro() {
        System.out.println("\nSelecione a pessoa: ");

        Pessoa pessoa;
        if ((pessoa = selecionarPessoa()) == null) {
            return;
        }

        System.out.println("\nBem-vindo " + pessoa.getNome() + "! Selecione o livro que deseja emprestar:\n");

        Livro livro;
        if ((livro = selecionarLivro()) == null) {
            return;
        }

        Emprestimo emprestimo = new Emprestimo(pessoa, livro, new Date());
        listaDeEmprestimos.add(emprestimo);

        System.out.println("\nO livro \"" + emprestimo.getLivro().getTitulo() +
                "\" foi emprestado com sucesso para " + emprestimo.getPessoa().getNome() + "!\n");

    }

    private static void devolverLivro() {
        if (listaDeEmprestimos.isEmpty()) {
            System.out.println("\nNenhum empréstimo foi realizado até o momento!\n");
            return;
        }

        System.out.println("\nSelecione a pessoa: ");

        Pessoa pessoa;
        if ((pessoa = selecionarPessoa()) == null) {
            return;
        }

        Emprestimo emprestimo;
        if ((emprestimo = selecionarEmprestimo(pessoa)) == null) {
            return;
        }

        emprestimo.setEmprestado(false);
        System.out.println("\nO livro \"" + emprestimo.getLivro().getTitulo() +
                "\" foi devolvido com sucesso por " + emprestimo.getPessoa().getNome() + "!\n");

    }

    private static void consultarHistoricoEmprestimos() {
        if (listaDeEmprestimos.isEmpty()) {
            System.out.println("\nNenhum empréstimo foi realizado até o momento!\n");
            return;
        }

        System.out.println("\nSelecione a pessoa: ");

        Pessoa pessoa;
        if ((pessoa = selecionarPessoa()) == null) {
            return;
        }

        int i = 0;
        for (Emprestimo emprestimo : listaDeEmprestimos) {
            if (emprestimo.getPessoa().equals(pessoa)) {
                i++;
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                String formattedDate = formatter.format(emprestimo.getData());
                System.out.println(i + ". " + emprestimo.getLivro().getTitulo() +
                        " - Status: " + (emprestimo.isEmprestado() ? "EMPRESTADO" : "DEVOLVIDO" ) +
                        " - Data do empréstimo: " + formattedDate);
            }
        }
    }

    private static Pessoa selecionarPessoa() {
        if (listaDePessoas.isEmpty()) {
            System.out.println("\nCadastre ao menos uma pessoa!\n");
            return null;
        }

        int i = 0;
        for (Pessoa pessoa : listaDePessoas) {
            i++;
            System.out.println(i + ". " + pessoa.getNome() + " - " + pessoa.getEmail());
        }

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            try {
                System.out.print("Insira o número correspondente à pessoa desejada: ");
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > listaDePessoas.size()) {
                    System.out.println("\nOpção inválida!\n");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("\nOpção inválida!\n");
                scanner.nextLine();
            }
        } while (opcao < 1 || opcao > listaDePessoas.size());

        return listaDePessoas.get(opcao - 1);
    }

    private static Livro selecionarLivro() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        livrosDisponiveis.addAll(listaDeLivros);

        for (Emprestimo emprestimo : listaDeEmprestimos) {
            int i = 0;
            boolean remove = false;

            for (Livro livro : livrosDisponiveis) {
                i++;
                if (emprestimo.isEmprestado() && emprestimo.getLivro().equals(livro)) {
                    remove = true;
                    break;
                }
            }

            if (remove) {
                livrosDisponiveis.remove(i - 1);
            }
        }

        if (livrosDisponiveis.isEmpty()) {
            System.out.println("\nNão existe nenhum livro disponível para empréstimo!\n");
            return null;
        }

        int i = 0;
        for (Livro livro : livrosDisponiveis) {
            i++;
            System.out.println(i + ". " + livro.getTitulo() + " - " + livro.getAutor());
        }

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            try {
                System.out.print("Insira o número correspondente ao livro desejado: ");
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > livrosDisponiveis.size()) {
                    System.out.println("\nOpção inválida!\n");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("\nOpção inválida!\n");
                scanner.nextLine();
            }
        } while (opcao < 1 || opcao > livrosDisponiveis.size());

        return livrosDisponiveis.get(opcao - 1);
    }

    private static Emprestimo selecionarEmprestimo(Pessoa pessoa) {

        List<Emprestimo> emprestimosAtivos = new ArrayList<>();
        for (Emprestimo emprestimo : listaDeEmprestimos) {
            if (emprestimo.getPessoa().equals(pessoa) && emprestimo.isEmprestado()) {
                emprestimosAtivos.add(emprestimo);
            }
        }

        if (emprestimosAtivos.isEmpty()) {
            System.out.println("\nVocê não tem nenhum livro disponível para devolução!\n");
            return null;
        }

        System.out.println("\nSelecione o livro que deseja devolver: ");
        int i = 0;
        for (Emprestimo emprestimo : emprestimosAtivos) {
            i++;

            if (emprestimo.getPessoa().equals(pessoa) && emprestimo.isEmprestado()) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                String formattedDate = formatter.format(emprestimo.getData());
                System.out.println(i + ". " + emprestimo.getLivro().getTitulo() + " - Data do empréstimo: " + formattedDate);
            }
        }

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            try {
                System.out.print("Insira o número correspondente ao livro que você deseja devolver: ");
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > emprestimosAtivos.size()) {
                    System.out.println("\nOpção inválida!\n");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("\nOpção inválida!\n");
                scanner.nextLine();
            }
        } while (opcao < 1 || opcao > emprestimosAtivos.size());

        return emprestimosAtivos.get(opcao - 1);
    }

}