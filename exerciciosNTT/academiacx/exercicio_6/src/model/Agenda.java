package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	static Scanner scanner = new Scanner(System.in);
	static List<Contato> contatos = new ArrayList<>();


	public static void criar(Agenda agenda) {

		String nome, telefone;

		System.out.println("Informe o nome do contato:");
		nome = scanner.nextLine();

		System.out.println("Informe o telefone do contato:");
		telefone = scanner.nextLine();

		Contato contato = new Contato(telefone, nome.toUpperCase());

		agenda.contatos.add(contato);
	}

	public static void excluir(Agenda agenda) {
		int posicao;

		agenda.listar();

		System.out.println("Informe a posição a ser excluída:");
		posicao = scanner.nextInt();

		try {
			agenda.contatos.remove(posicao);
		} catch (IndexOutOfBoundsException e) {
			System.out.printf("Erro: posição inválida", e.getMessage() + "\n");
		}
	}

	public static void listar() {
		System.out.println("Listando os contatos da Agenda:");
		int i = 0;
		for (Contato contato : contatos) {
			System.out.println("Posicao [" + (i+1) + "] " + contato.getTelefone());
			i++;
		}
		System.out.printf("---------------------------------------");
	}

	public static void pesquisar(Agenda agenda) {
		String nome;

		System.out.println("Informe o nome do contato:");
		nome = scanner.nextLine();

		nome = nome.toUpperCase();
		for (Contato contato : contatos) {
			if (contato.getNome().equals(nome)) {
				System.out.println("Contato: " + contato.getTelefone());
			}
		}
	}
}
