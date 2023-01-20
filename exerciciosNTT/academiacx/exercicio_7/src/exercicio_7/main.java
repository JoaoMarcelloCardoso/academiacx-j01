package exercicio_7;

import model.Biblioteca;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Biblioteca biblioteca = new Biblioteca();

        do {
            System.out.printf("**** Menu Principal *****\n");
            System.out.printf(" 1 - Emprestar Livro\n");
            System.out.printf(" 2 - Devolver Livro\n");
            System.out.printf(" 3 - Cadastrar sócio\n");
            System.out.printf(" 4 - Cadastrar Livro\n");
            System.out.printf(" 5 - Listar Livros\n");
            System.out.printf(" 6 - Listar Sócios\n");
            System.out.printf(" 7 - Listar Empréstimos\n");
            System.out.printf(" 0 - Encerrar o Programa\n");
            System.out.printf("\nOpção Desejada: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Informe o nome do livro:");
                  String nomeLivro =  scanner.nextLine();
                    System.out.println("Informe o nome do sócio:");
                  String nomePessoa = scanner.nextLine();
                  biblioteca.emprestarLivro(biblioteca.getLivros(),nomeLivro, biblioteca.getPessoas(), nomePessoa);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Informe o nome do livro:");
                    nomeLivro =  scanner.nextLine();
                    biblioteca.devolverLivro(biblioteca.getLivros(),nomeLivro);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Informe o nome do sócio:");
                    nomePessoa = scanner.nextLine();
                    System.out.println("Informe o numero de telefone do sócio:");
                    String telefone = scanner.nextLine();
                    biblioteca.addPessoa(nomePessoa,telefone);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Informe o nome do livro:");
                    nomeLivro = scanner.nextLine();
                    System.out.println("Informe o numero de registro:");
                    String registro = scanner.nextLine();
                    System.out.println("Informe o nome do autor:");
                    String autor = scanner.nextLine();
                    biblioteca.addLivro(nomeLivro,registro, autor);
                    break;
                case 5:
                    biblioteca.listarLivros(biblioteca.getLivros());
                    break;
                case 6:
                    biblioteca.listarSócios(biblioteca.getPessoas());
                    break;
                case 7:
                    biblioteca.listarEmpréstimos(biblioteca.getLivros());
                    break;
            }

            System.out.printf("\n\n");

        } while (opcao != 0);
    }
}