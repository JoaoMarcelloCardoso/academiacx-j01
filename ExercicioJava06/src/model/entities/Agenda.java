package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Agenda {

    // Nome da agenda
    private String nome;
    private List<Contato> contatos = new ArrayList<>();
    private LocalDate data;

    public Agenda() {

    }

    public Agenda(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void addContatos(Contato contato) {
        contatos.add(contato);
    }
    public void removeContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                contatos.remove(i);
                break;
            }
        }
    }

    public void listarContatos(){
        for (Contato c: contatos) {
            System.out.println("\nNome: " + c.getNome());
            System.out.println("Telefone: " + c.getTelefone());
            System.out.println("Email: " + c.getEmail());
            System.out.println();
        }

    }

}
