import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Scanner scanner = new Scanner(System.in);

        String user, senha;
        int opcao;

        do {
            System.out.print("Digite o nome de usuário: ");
            user = scanner.next();
            System.out.print("Digite a senha: ");
            senha = scanner.next();

            if (!user.equals("admin") || !senha.equals("8080")) {
                System.out.println("Senha ou usuário com erro, tente de novo.");
            }
        } while (!user.equals("admin") || !senha.equals("8080"));

        do {
            System.out.println("Lojina de Eletrônicos: Backoffice - Welcome!:");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Listar produtos cadastrados");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.next();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    produtos.add(new Produto(nome, preco));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Produtos cadastrados:");
                    for (Produto produto : produtos) {
                        System.out.println(produto.getNome() + " - R$" + produto.getPreco());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }
}


