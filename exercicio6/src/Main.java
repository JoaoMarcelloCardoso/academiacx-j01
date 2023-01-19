import model.Agenda;
import model.Contato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input != 8) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Deletar contato");
            System.out.println("3 - Atualizar email de contato");
            System.out.println("4 - Atualizar nome de contato");
            System.out.println("5 - Atualizar celular de contato");
            System.out.println("6 - Imprimir contato por id");
            System.out.println("7 - Imprimir todos os contatos");
            System.out.println("8 - Sair");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Insira o nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Insira o celular:");
                    String celular = scanner.nextLine();
                    System.out.println("Insira o email:");
                    String email = scanner.nextLine();
                    agenda.adicionarContato(new Contato(nome, celular, email));
                    break;
                case 2:
                    System.out.println("Insira o id do contato a ser deletado:");
                    int id = scanner.nextInt();
                    agenda.deletarContato(id);
                    break;
                case 3:
                    System.out.println("Insira o id do contato para atualizar o email:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insira o novo email:");
                    email = scanner.nextLine();
                    agenda.atualizarEmailPorId(id, email);
                    break;
                case 4:
                    System.out.println("Insira o id do contato para atualizar o nome:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insira o novo nome:");
                    nome = scanner.nextLine();
                    agenda.atualizarNomePorId(id, nome);
                    break;
                case 5:
                    System.out.println("Insira o id do contato para atualizar o celular:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insira o novo celular:");
                    celular = scanner.nextLine();
                    agenda.atualizarCelularPorId(id, celular);
                    break;
                case 6:
                    System.out.println("Insira o id do contato para ser impresso:");
                    id = scanner.nextInt();
                    agenda.imprimirContatoPorId(id);
                    break;
                case 7:
                    agenda.imprimirTodosOsContatos();
                    break;
                case 8:
                    System.out.println("Agenda de contatos finalizada");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

}