package com.cxcommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Iniciando arquivo de emprestimos ----");


        Emprestimo emprestimo = new Emprestimo();

        boolean roda = true;


        while (roda) {


            System.out.println();
            System.out.println();
            System.out.println("----- Menu -----:");
            System.out.println("  1 - Exibir as pessoas registradas----");
            System.out.println("  2 - Adicionar uma pessoa ao registro-");
            System.out.println("  3 - Remover uma pessoa do registro---");
            System.out.println("  4 - Exibir os livros registrados-----");
            System.out.println("  5 - Adicionar um livro ao registro---");
            System.out.println("  6 - Remover um livro do registro-----");
            System.out.println("  0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 0:
                    roda = false;
                    break;

                case 1:
                    emprestimo.exibirPessoas();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Nome: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print("    Telefone: ");
                    String telefone = scanner.nextLine();

                    Pessoa pessoa = new Pessoa(nome, telefone);
                    emprestimo.adicionarPessoa(pessoa);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Telefone: ");
                    scanner.nextLine();
                    String telefonex = scanner.nextLine();
                    emprestimo.remover(telefonex);

                    System.out.println("Operação realizada com sucesso");
                    break;

                case 4:
                    emprestimo.exibirLivros();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Nome: ");
                    scanner.nextLine();
                    String nomex = scanner.nextLine();
                    System.out.print("    Codigo do livro: ");
                    String codigo = scanner.nextLine();

                    Livro livro = new Livro(nomex, codigo);
                    emprestimo.adicionarLivro(livro);

                    break;

                case 6:
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Codigo do livro: ");
                    scanner.nextLine();
                    String codigox = scanner.nextLine();
                    emprestimo.removerLivros(codigox);

                    System.out.println("Operação realizada com sucesso");
                    break;

                default:
                    System.out.println("Opção não encontrada. Tente novamente.");
                    break;

            }


        }
    }
}