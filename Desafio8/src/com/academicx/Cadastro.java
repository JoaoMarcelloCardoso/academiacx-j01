package com.academicx;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private final List<Produto> produtos;

    public Cadastro() {
        produtos = new ArrayList<>();
    }

    public void addItem(String nome, double preco){
        Produto novoP = new Produto(nome, preco);
        produtos.add(novoP);
    }

    public void listar(){
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("\n====================================");
            System.out.println(produtos.get(i).getNome()
                    + " - R$" + produtos.get(i).getPreco());
            System.out.println("====================================");
        }
    }
}
