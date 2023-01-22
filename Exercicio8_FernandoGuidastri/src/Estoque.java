import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(String nome, double preco, int codigo){

        Produto produto = new Produto(nome, preco, codigo);
        if(!produtos.contains(produto)){

            produtos.add(produto);
        }else {
            System.out.println("Esse produto já existe");
        }
    }

    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Não há nenhum produto cadastrado");
        }else {

            produtos.forEach(produto -> {
                System.out.println("Nome: " + produto.getNomeProduto());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Codigo: " + produto.getCodigoProduto() + "\n");

            });
        }
    }
    public void removerProduto(int codigo){
        if (produtos.size() > 0) {
            for (int i = 0; i < produtos.size(); i++) {
                if (codigo == produtos.get(i).getCodigoProduto()){
                    produtos.remove(i);
                    break;
                }
            }

        }


    }

}
