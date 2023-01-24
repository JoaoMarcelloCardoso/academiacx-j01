package exercises.exercise_08;
import javax.swing.JOptionPane;
import exercises.exercise_08.Produto;
import java.util.HashMap;

public class Sistema {
    
    public static HashMap<Produto, Integer> gerarProdutos(HashMap<Produto, Integer> produtos) {
        Produto produto1 = new Produto("Beyblade",4.5,1);
        Produto produto2 = new Produto("Bola",2.5,1);
        Produto produto3 = new Produto("Boneco",3.5,1);
        
        produtos.put(produto1, produto1.getQuantidade());
        produtos.put(produto2, produto2.getQuantidade());
        produtos.put(produto3, produto3.getQuantidade());
        
        return produtos;
    }
    public static void main(String[] args) {
        HashMap<Produto, Integer> produtos = new HashMap<>();
        produtos = gerarProdutos(produtos);
        int option = 0;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("1 - Login\n2 - Sair"));
            switch (option) {
                case 1:
                    String login = JOptionPane.showInputDialog("Digite o login");
                    String senha = JOptionPane.showInputDialog("Digite a senha");
                    if (login.equals("admin") && senha.equals("8080")) {
                        JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
                                    int opcao = 0;
                            do {
                                opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar produto\n2 - Listar produtos\n3 - Sair"));
                                switch (opcao) {
                                    case 1:
                                        // cadastrar produto
                                        String nome = JOptionPane.showInputDialog("Digite o nome do produto");
                                        String preco = JOptionPane.showInputDialog("Digite o preço do produto");
                                        String quantidade = JOptionPane.showInputDialog("Digite a quantidade do produto");
                                        Produto produto = new Produto(nome, Double.parseDouble(preco), Integer.parseInt(quantidade));
                                        produtos.put(produto, produto.getQuantidade());
                                        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                                        break;
                                    case 2:
                                        // listar produtos
                                        String produtosCadastrados = "";
                                        for (Object produtoCadastrado : produtos.keySet()) {
                                            produtosCadastrados += "-" + produtoCadastrado + "\n";
                                        }
                                        JOptionPane.showMessageDialog(null, produtosCadastrados);
                                        break;
                                        
                                    case 3:
                                        JOptionPane.showMessageDialog(null, "Saindo...");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                                        break;
                                }
                            } while (opcao != 3);

                    } else {
                        JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
                    }
                    break;
                case 2:
                    // sair
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (option != 2);
    }
    
}

        
