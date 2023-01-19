import model.entities.Loja;
import model.entities.Produto;
import model.entities.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Loja loja = new Loja();

        System.out.println("Ola! Seja bem vindo a " + loja.getNome() + "!");

        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();

        Usuario usuario = new Usuario(nome);

        System.out.println("Seja bem vindo, " + usuario.getNome() + "!");

        System.out.println("Para acessar nosso sistema, digite seu usuário e senha: ");

        System.out.print("User: ");
        String user = sc.nextLine();

        System.out.print("Pass: ");
        String pass = sc.nextLine();

        while(usuario.verificarCredenciais(user, pass) != true){
            System.out.println("Usuário ou senha incorretos!\nPor Favor, insira os dados novamente.");
            System.out.print("User: ");
            user = sc.nextLine();

            System.out.print("Pass: ");
            pass = sc.nextLine();
        }

        while (true){
        System.out.println("\nOlá! O que deseja fazer?");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Listar produtos cadastrados");
        System.out.println("4 - Sair");
        int opcao = sc.nextInt();

        if (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    sc.nextLine();
                    String nomeProduto = sc.nextLine();
                    System.out.print("Tipo do produto: ");
                    String tipoProduto = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();


                    Produto produto = new Produto(nomeProduto, tipoProduto, preco);
                    loja.cadastrarProdutos(produto);
                    System.err.println("Produto cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.print("Nome do produto que deseja remover: ");
                    sc.nextLine();
                    nomeProduto = sc.nextLine();
                    loja.removerProdutos(nomeProduto);

                    System.err.println("Produto removido com sucesso!\n");
                    break;

                case 3:
                    loja.listarProdutos();
                        if (loja.getProdutos().isEmpty()){
                            System.out.println("Sem produtos cadastrados!");
                        }

                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        else {
            System.out.println("Saindo...");
            break;
            }
        }
    }
}