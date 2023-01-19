package model;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
        this.contatos.add(new Contato("Pedro", "(41) 9 9999-9999", "pedro@email.com"));
        this.contatos.add(new Contato("Larissa", "(41) 9 9999-9999", "larissa@email.com"));
        this.contatos.add(new Contato("Joana", "(41) 9 9999-9999", "joana@email.com"));
        this.contatos.add(new Contato("Maria", "(41) 9 8888-8888", "maria@email.com"));
        this.contatos.add(new Contato("Carlos", "(41) 9 7777-7777", "carlos@email.com"));
        this.contatos.add(new Contato("Ana", "(41) 9 6666-6666", "ana@email.com"));
        this.contatos.add(new Contato("Ricardo", "(41) 9 5555-5555", "ricardo@email.com"));
        this.contatos.add(new Contato("Claudia", "(41) 9 4444-4444", "claudia@email.com"));
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!!");
        System.out.println("------------------------------------------------");
        imprimeContato(contato);

    }

    public void imprimeContato(Contato contato){

        System.out.println("ID: "+ contato.getId());
        System.out.println("Nome: "+ contato.getNome());
        System.out.println("Celular: "+ contato.getCelular());
        System.out.println("Email: "+ contato.getEmail());
        System.out.println("------------------------------------------------");
    }

    public void imprimirContatoPorId(int id) {
        System.out.println("------------------------------------------------");
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
               imprimeContato(contato);
               return;
            }
        }
        System.out.println("Contato com id " + id + " não encontrado.");

    }
    public void imprimirTodosOsContatos() {
        System.out.println("------------------------------------------------");

        for (Contato contato : contatos) {
            imprimeContato(contato);
        }
    }



    public void deletarContato(int id) {
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                contatos.remove(contato);
                System.out.println("Contato "+ contato.getNome() + " deletado com sucesso");


                return;
            }
        }
    }

    public void atualizarEmailPorId(int id, String email) {
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                contato.setEmail(email);
                System.out.println("Email atualizado com sucesso");
                return;
            }
        }
    }

    public void atualizarNomePorId(int id, String nome) {
        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                contato.setNome(nome);
                System.out.println("Nome atualizado com sucesso");
                return;
            }
        }
    }

    public void atualizarCelularPorId(int id, String celular) {

        for (Contato contato : contatos) {
            if (contato.getId() == id) {
                contato.setCelular(celular);
                System.out.println("Celular atualizado com sucesso");
                return;
            }

        }

    }
}
