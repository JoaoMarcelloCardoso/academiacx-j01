package models;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<Contato>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                break;
            }
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }
}