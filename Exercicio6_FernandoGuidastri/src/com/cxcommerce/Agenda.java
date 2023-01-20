package com.cxcommerce;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public void exibirContatos(){
        for (int i = 0; i < getContatos().size(); i++)
        {
            Contato contato = getContatos().get(i);
            System.out.println();
            System.out.println();

            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println();
        }



    }

    public List<Contato> getContatos(){
        if (this.contatos == null)
            this.contatos = new ArrayList<>();

        return this.contatos;


    }

    public void adicionarContato(Contato contato){
        getContatos().add(contato);

    }

    public void remover(String telefone){
        if (getContatos().size() > 0) {
            for (int i = 0; i < getContatos().size(); i++) {
                if (telefone.equalsIgnoreCase(contatos.get(i).getTelefone())) {
                    contatos.remove(i);
                    break;
                }
            }

        }


    }
}