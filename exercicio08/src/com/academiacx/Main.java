package com.academiacx;

import com.academiacx.model.Produto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<Produto> listaDeProdutos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user;
        String pass;

        while (true) {
            System.out.print("Insira seu user: ");
            user = scanner.nextLine();

            System.out.print("Insira sua senha: ");
            pass = scanner.nextLine();

            if (user.equals("admin") && pass.equals("8080")) {
                break;
            }

            System.out.println("Usuário ou senha inválidos! Tente novamente.\n");
        }

        System.out.println("\nUsuário autenticado com sucesso!");
        System.out.println("Seja bem-vindo!");
        mainMenu();
    }

    private static void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Remover produto");
            System.out.println("4. Sair do programa");

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
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    System.out.println("\nPrograma encerrado!");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
            }

        } while (opcao != 4);
    }

    private static void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("\nInsira o nome do produto que deseja adicionar: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Insira o código SKU do produto: ");
        produto.setSku(scanner.nextLine());

        System.out.print("Insira a categoria do produto: ");
        produto.setCategoria(scanner.nextLine());

        do {
            try {
                System.out.print("Insira o preço do produto: ");
                produto.setPreco(scanner.nextDouble());
            }
            catch (InputMismatchException e) {
                System.out.println("\nOpção inválida!\nTente novamente\n");
                scanner.nextLine();
            }
        } while (produto.getPreco() == null);

        listaDeProdutos.add(produto);

        System.out.println("\nO produto " + produto.getNome() + " foi cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        if (isListEmpty()) {
            return;
        }

        mostrarProdutos();
    }


    private static void removerProduto() {
        if (isListEmpty()) {
            return;
        }

        mostrarProdutos();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            try {
                System.out.print("Insira o número correspondente ao produto que deseja remover: ");
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > listaDeProdutos.size()) {
                    System.out.println("\nOpção inválida!\n");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("\nOpção inválida!\n");
                scanner.nextLine();
            }
        } while (opcao < 1 || opcao > listaDeProdutos.size());

        Produto produto = listaDeProdutos.get(opcao - 1);

        listaDeProdutos.remove(opcao - 1);

        System.out.println("\nO produto " + produto.getNome() + " foi removido com sucesso!");
    }

    private static void mostrarProdutos() {
        System.out.println("\nLista de produtos cadastrados: ");
        int i = 0;
        for (Produto produto : listaDeProdutos) {
            i++;
            System.out.println(i + ". " + produto.getNome()
                    + " - R$" + produto.getPreco()
                    + " - SKU: " + produto.getSku()
                    + " - Categoria: " + produto.getCategoria());
        }
    }

    private static boolean isListEmpty() {
        if (listaDeProdutos.isEmpty()) {
            System.out.println("\nNão existe nenhum produto cadastrado!\n");
            return true;
        }

        return false;
    }
}