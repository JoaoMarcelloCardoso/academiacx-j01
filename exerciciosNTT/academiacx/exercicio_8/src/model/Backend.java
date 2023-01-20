package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backend {

    Scanner scanner = new Scanner(System.in);
    int opcao;
    List<Produto> produtos = new ArrayList<>();
    private boolean logged = false;
    public boolean login(String user, String password) {
        if (user.equals("admin") && password.equals("8080")){
            logged = true;
            return logged;
        }
        else {
            System.out.println("Login incorreto");
            return logged;
        }
    }

    public void menu() {
        do {
            System.out.printf("**** Menu Principal *****\n");
            System.out.printf(" BACKOFFICE\n");
            System.out.printf(" 1 - Cadastrar  Produto\n");
            System.out.printf(" 2 - Listar  Produtos\n");
            System.out.printf(" 3 - Excluir  Produto\n");
            System.out.printf(" 4 - Editar  Produto\n");
            System.out.printf(" 0 - Encerrar o Programa\n");
            System.out.printf("\nOpção Desejada: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    excluir();
                    break;
                case 4:
                    editar();
                    break;
            }
            System.out.printf("\n\n");

        } while (opcao != 0);
    }


    public void menuEdição(Produto produto) {
        do {
            System.out.printf("**** Menu Edição *****\n");
            System.out.printf(" 1 - Editar nome\n");
            System.out.printf(" 2 - Editar quantidade\n");
            System.out.printf(" 3 - Editar preço\n");
            System.out.printf(" 0 - Encerrar edição\n");
            System.out.printf("\nOpção Desejada: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Informe o nome do produto");
                    String nome = scanner.nextLine();

                    produto.setNome(nome.toUpperCase());
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Informe a quantidade do produto");
                    Integer quantidade = scanner.nextInt();

                    produto.setQuantidade(quantidade);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Informe o preco do produto");
                    Double preco = scanner.nextDouble();

                    produto.setPreco(preco);
                    break;
            }
            System.out.printf("\n\n");

        } while (opcao != 0);
        menu();
    }
    private void editar() {
        System.out.println("Informe o ID do produto");
        Integer id = scanner.nextInt();

        if(encontrarProduto(id) != null){
         menuEdição(encontrarProduto(id));
        };
    }

    private void excluir() {
        scanner.nextLine();
        System.out.println("Informe o ID do produto");
        Integer id = scanner.nextInt();

        Produto produto = encontrarProduto(id);
        if (produto != null){
            produtos.remove(produto);
        }
    }

    private Produto encontrarProduto(Integer id) {
        for (Produto produto :
                produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            };
        }
        return null;
    }

    private void listar() {
        if (!produtos.isEmpty()) {
            for (Produto produto :
                    produtos) {
                System.out.println(produto.dadosProdutos());
            }
        }
        else {
            System.out.println("Lista de produtos está vazia.");
        }
    }

    private void cadastrar() {
        System.out.println("Informe o ID do produto");
        Integer id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe o nome do produto");
        String nome = scanner.nextLine();

        System.out.println("Informe a quantidade do produto");
        Integer quantidade = scanner.nextInt();

        System.out.println("Informe o preco do produto");
        Double preco = scanner.nextDouble();

        scanner.nextLine();

        produtos.add(new Produto(id,nome.toUpperCase(),preco,quantidade));
    }
}
