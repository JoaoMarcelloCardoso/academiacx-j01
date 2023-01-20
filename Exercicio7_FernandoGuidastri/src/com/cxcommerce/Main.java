package com.cxcommerce;

import com.cxcommerce.Pessoa;
import com.cxcommerce.Emprestimo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Iniciando arquivo de emprestimos ----");


        Emprestimo emprestimo = new Emprestimo();

        String opcao = "";

        while (true) {



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

            opcao = scanner.next();
            if ("0".equals(opcao)){
                break;
            }

            else{


                if ("1".equals(opcao)){
                    emprestimo.exibirPessoas();
                }

                else if ("2".equals(opcao)){
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Nome: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print("    Telefone: ");
                    String telefone = scanner.nextLine();

                    Pessoa pessoa = new Pessoa(nome,telefone);
                    emprestimo.adicionarPessoa(pessoa);
                }

                else if ("3".equals(opcao)){
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Telefone: ");
                    scanner.nextLine();
                    String telefone = scanner.nextLine();
                    emprestimo.remover(telefone);

                    System.out.println("Operação realizada com sucesso");
                }
                if ("4".equals(opcao)){
                    emprestimo.exibirLivros();
                }

                else if ("5".equals(opcao)){
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Nome: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print("    Codigo do livro: ");
                    String codigo = scanner.nextLine();

                    Livro livro = new Livro(nome,codigo);
                    emprestimo.adicionarLivro(livro);
                }

                else if ("6".equals(opcao)){
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Codigo do livro: ");
                    scanner.nextLine();
                    String codigo = scanner.nextLine();
                    emprestimo.removerLivros(codigo);

                    System.out.println("Operação realizada com sucesso");
                }







                else{
                    System.out.println("Opção não encontrada. Tente novamente.");
                }

            }

        }


    }
}