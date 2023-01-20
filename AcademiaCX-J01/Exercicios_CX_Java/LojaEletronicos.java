import java.util.ArrayList;
import java.util.Scanner;

public class LojaEletronicos {

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Login:");
            String user = scanner.nextLine();
            System.out.println("Senha:");
            String senha = scanner.nextLine();
                if (!user.equals("admin") || !senha.equals("8080")) {
                    System.out.println("Usuário ou senha incorretos. Tente novamente.");
                    continue;
                }
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Listar produtos cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine();
                if (opcao == 1) {
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    produtos.add(new Produto(nome, preco));
                    System.out.println("Produto cadastrado com sucesso.");
                } else if (opcao == 2) {
                    for (Produto produto : produtos) {
                        System.out.println("Nome: " + produto.getNome());
                        System.out.println("Preço: " + produto.getPreco());
                    }
                } else if (opcao == 3) {
                    break;
                }
            }

            scanner.close();
        }

    }
class Produto {
    private String nome;
    private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
}
