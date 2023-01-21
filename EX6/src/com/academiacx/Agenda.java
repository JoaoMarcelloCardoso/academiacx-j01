package com.academiacx;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private final List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void addPessoas(String nome, String celular, String email){
        Contato novo = new Contato(nome,celular,email);
        contatos.add(novo);
    }

    public void delAgenda(String nome){
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getNome().toUpperCase().equals(nome)){
                contatos.remove(i);
            }
        }
    }

    public void mostrarAgenda() {
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome()
                    + " - Email: " + contato.getEmail()
                    + " |Celular: " + contato.getCelular());
        }
    }
}