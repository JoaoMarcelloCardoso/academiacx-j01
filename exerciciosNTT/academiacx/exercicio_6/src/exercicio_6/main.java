package exercicio_6;

import java.io.IOException;
import java.util.Scanner;

import model.Agenda;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcao;

		Agenda agenda = new Agenda();

		do {
			System.out.printf("**** Menu Principal *****\n");
			System.out.printf(" 1 - Criar Contato\n");
			System.out.printf(" 2 - Excluir Contato\n");
			System.out.printf(" 3 - Listar Contatos\n");
			System.out.printf(" 4 - Pesquisar Contato\n");
			System.out.printf(" 0 - Encerrar o Programa\n");
			System.out.printf("\nOpção Desejada: ");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				agenda.criar(agenda);
				break;
			case 2:
				agenda.excluir(agenda);
				break;
			case 3:
				agenda.listar();
				break;
			case 4:
				agenda.pesquisar(agenda);
				break;
			}

			System.out.printf("\n\n");

		} while (opcao != 0);
	}

}
