import model.entities.Agenda;
import model.entities.Contato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("\nBem vindo!");
        System.out.print("\nDê um nome para a sua agenda: ");
        String nomeAgenda = sc.nextLine();

        LocalDate data = LocalDate.now();

        Agenda agenda = new Agenda(nomeAgenda, data);

        while (true) {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Adicionar um contato");
            System.out.println("2- Remover um contato");
            System.out.println("3- Mostrar lista de contatos");
            System.out.println("4- Sair");
            int opcao = sc.nextInt();

            if (opcao != 4) {
                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.print("Telefone: ");
                        String telefone = sc.nextLine();
                        System.out.print("E-mail: ");
                        String email = sc.nextLine();

                        agenda.addContatos(new Contato(nome, telefone, email));
                        break;

                    case 2:
                        System.out.print("Nome do contato que deseja remover: ");
                        sc.nextLine();
                        String nomeContato = sc.nextLine();
                        agenda.removeContato(nomeContato);

                        System.err.println("Contato removido com sucesso!");
                        System.out.println("\nContatos: ");
                        agenda.listarContatos();
                        break;

                    case 3:
                        agenda.listarContatos();
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } else {
                System.out.println("Saindo...");
                break;
            }
        }
    }
}