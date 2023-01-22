


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Autenticao autenticao = new Autenticao();
        System.out.println("----Acessando o menu do usuário----");


        while (true) {

            System.out.println("Informe o login: ");
            String usuario = scanner.next();

            System.out.println("Informe a senha: ");
            String senha = scanner.next();

            boolean autenticado = autenticao.Autenticar(usuario, senha);

            if (autenticado) {
                break;

            } else {
                System.out.println("Usuário ou senha inválido");

            }


        }


        boolean roda = true;
        Estoque estoque = new Estoque();

        while (roda){

            System.out.println();
            System.out.println();
            System.out.println("----- Menu -----:");
            System.out.println("  1 - Adicionar produto");
            System.out.println("  2 - Remover produto");
            System.out.println("  3 - Listar produtos");
            System.out.println("  0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao){

                case 1:

                    System.out.println("Insira o nome do produto:");
                    String nome = scanner.next();
                    System.out.println("Insira o preço do produto");
                    double preco = scanner.nextDouble();
                    System.out.println("Insira o codigo do produto");
                    int codigo = scanner.nextInt();

                    estoque.cadastrarProduto(nome, preco, codigo);




                    break;
                case 2:
                    System.out.println("Insira o código do produto que deseja remover");
                    int codigox = scanner.nextInt();
                    estoque.removerProduto(codigox);
                    System.out.println("Produto removido com sucesso.");
                    break;
                case 3:
                    estoque.listarProdutos();

                    break;
                case 0:
                    roda = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");

            }


        }




    }
}