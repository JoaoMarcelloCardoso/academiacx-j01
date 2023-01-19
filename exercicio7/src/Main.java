import controller.EmprestimoController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmprestimoController emprestimoController = new EmprestimoController();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input != 6) {
            System.out.println("1 - Emprestar livro");
            System.out.println("2 - Devolver livro");
            System.out.println("3 - Imprimir lista de pessoas");
            System.out.println("4 - Imprimir lista de livros");
            System.out.println("5 - Imprimir lista de empréstimos");
            System.out.println("6 - Sair");
            System.out.print("Selecione uma opção: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Informe o ID do livro: ");
                    int idLivro = scanner.nextInt();
                    System.out.print("Informe o ID da pessoa: ");
                    int idPessoa = scanner.nextInt();
                    emprestimoController.emprestarLivro(idLivro, idPessoa);
                    break;
                case 2:
                    System.out.print("Informe o ID do empréstimo: ");
                    int idEmprestimo = scanner.nextInt();
                    emprestimoController.devolverLivro(idEmprestimo);
                    break;
                case 3:
                    emprestimoController.imprimirPessoas();
                    break;
                case 4:
                    emprestimoController.imprimirLivros();
                    break;
                case 5:
                    emprestimoController.imprimirEmprestimos();
                    break;
                case 6:
                    System.out.println("Programa de empréstimos finalizado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}