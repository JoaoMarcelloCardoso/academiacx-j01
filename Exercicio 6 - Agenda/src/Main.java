import models.Contato;
import models.Agenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Tiago's Agendinha 2023. Bem-vindo e escolha uma opção:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar contato pelo nome");
            System.out.println("3 - Mostrar todos os contatos");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Telefone: ");
                    String telefone = scanner.next();
                    Contato contato = new Contato(nome, telefone);
                    agenda.adicionarContato(contato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome: ");
                    nome = scanner.next();
                    Contato contatoEncontrado = agenda.buscarContato(nome);
                    if (contatoEncontrado != null) {
                        System.out.println("Telefone: " + contatoEncontrado.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");

                    }
                    break;
                case 3:
                    System.out.println("Todos os contatos:");
                    for (Contato c : agenda.getContatos()) {
                        System.out.println(c.getNome() + " - " + c.getTelefone());
                    }
                    break;
                case 0:
                    System.out.println("Até mais...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}