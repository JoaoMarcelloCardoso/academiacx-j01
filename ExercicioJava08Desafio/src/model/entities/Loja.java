package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome = "Teco Teco Eletrônicos";
    private List<Produto> produtos = new ArrayList<>();



    public Loja() {

    }

    public Loja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void cadastrarProdutos(Produto produto) {
        produtos.add(produto);
    }

    public void removerProdutos(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                produtos.remove(i);
                break;
            }
        }
    }
    public void listarProdutos(){
        for (Produto p: produtos) {
            System.out.println("\nNome: " + p.getNome());
            System.out.println("Tipo: " + p.getTipo());
            System.out.println("Preço: " + p.getPreco());
            System.out.println();
        }

    }
}
