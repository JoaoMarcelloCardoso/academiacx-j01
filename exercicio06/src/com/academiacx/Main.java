package com.academiacx;

import com.academiacx.model.Agenda;
import com.academiacx.model.Contato;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Agenda agenda;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        agenda = new Agenda();

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar contato à agenda");
            System.out.println("2. Remover contato da agenda");
            System.out.println("3. Ver lista de contatos");
            System.out.println("4. Sair do programa");

            try {
                System.out.print("Selecione a opção desejada: ");
                opcao = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("\nOpção inválida!\n");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    removerContato();
                    break;
                case 3:
                    mostrarListaDeContatos();
                    break;
                case 4:
                    System.out.println("\nPrograma encerrado!");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
            }

        } while (opcao != 4);
    }


    private static void adicionarContato() {
        Scanner scanner = new Scanner(System.in);
        Contato contato = new Contato();

        System.out.print("\nInsira o nome do contato: ");
        contato.setNome(scanner.nextLine());

        System.out.print("\nInsira o número de telefone do contato: ");
        contato.setTelefone(scanner.nextLine());

        agenda.setContatos(contato);
        System.out.println("\nContato " + contato.getNome() + " adicionado com sucesso à Agenda!\n");
    }

    private static void removerContato() {
        if (agenda.getContatos().isEmpty()) {
            System.out.println("\nA agenda está vazia!\n");
            return;
        }

        System.out.println("\nContatos atualmente disponíveis na agenda: ");

        for (int i = 0; i < agenda.getContatos().size(); i++) {
            Contato contato = agenda.getContatos().get(i);
            System.out.println((i + 1) + ". " + contato.getNome() + " - " + contato.getTelefone());
        }

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            try {
                System.out.print("Insira o número correspondente ao contato que deseja remover: ");
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > agenda.getContatos().size()) {
                    System.out.println("\nOpção inválida!\n");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("\nOpção inválida!\n");
                scanner.nextLine();
            }
        } while (opcao < 1 || opcao > agenda.getContatos().size());

        agenda.getContatos().remove(opcao - 1);
        System.out.println("\nContato removido com sucesso!\n");
    }

    private static void mostrarListaDeContatos() {
        if (agenda.getContatos().isEmpty()) {
            System.out.println("\nA agenda está vazia!\n");
            return;
        }

        System.out.println("\nContatos atualmente disponíveis na agenda: ");

        for (int i = 0; i < agenda.getContatos().size(); i++) {
            Contato contato = agenda.getContatos().get(i);
            System.out.println((i + 1) + ". " + contato.getNome() + " - " + contato.getTelefone());
        }

        System.out.println();
    }
}