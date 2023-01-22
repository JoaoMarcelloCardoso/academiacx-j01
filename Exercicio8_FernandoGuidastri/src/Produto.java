public class Produto {

    private String nomeProduto;
    private double preco;
    private int codigoProduto;

    public Produto(String nomeProduto, double preco, int codigoProduto) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
}
