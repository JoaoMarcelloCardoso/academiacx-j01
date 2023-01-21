import model.Emprestimo;
import model.Livro;
import model.Pessoa;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<Livro>();
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar pessoa: ");
            System.out.println("2. Cadastrar livro");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro: ");
            System.out.println("5. Sair: ");
            System.out.print("O que deseja fazer: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:
                    System.out.println("Insira o nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.println("Insira o CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.println("Insira o celular: ");
                    String celular = scanner.nextLine();

                    pessoas.add(new Pessoa(nome, cpf, celular));

                    System.out.println(pessoas);

                    break;


                case 2:
                    System.out.println("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Autor: ");
                    String autor = scanner.nextLine();

                    livros.add(new Livro(titulo, autor));

                    System.out.println(livros);
                    break;

                case 3:
                    System.out.println("Insira o título do livro: ");
                    titulo = scanner.nextLine();
                    for (int i = 0; i < livros.size(); i++) {
                        if (livros.get(i).getTitulo().equals(titulo)) {
                            System.out.println("model.Livro disponível!");

                            System.out.println("Autor: ");
                            String nomeAutor = scanner.nextLine();

                            System.out.println("Nome cliente: ");
                            nome = scanner.nextLine();

                            LocalDate dataEmprestimo = LocalDate.now();

                            emprestimos.add(new Emprestimo(nome, nomeAutor, dataEmprestimo));

                            System.out.println(emprestimos);

                        } else {
                            System.out.println("model.Livro não cadastrado!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Insira o nome do cliente: ");
                    nome = scanner.nextLine();

                    System.out.println("Insira o nome do autor: ");
                    autor = scanner.nextLine();

                    for (int i = 0; i < emprestimos.size(); i++) {
                        if (true) {
                            emprestimos.remove(emprestimos.get(i));
                        }
                    }
                        System.out.println(emprestimos);
                        System.out.println("Devolução feita com sucesso! ");

                default:
                    return;
                    }
            }
        }
    }
