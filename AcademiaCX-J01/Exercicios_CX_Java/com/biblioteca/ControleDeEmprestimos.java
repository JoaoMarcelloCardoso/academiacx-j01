package com.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeEmprestimos {

    public static void main(String[] args) {
        ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Realizar empréstimo");
            System.out.println("2. Devolver livro");
            System.out.println("3. Listar empréstimos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome da pessoa: ");
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Código do livro: ");
                String codigo = scanner.nextLine();
                System.out.print("Data de empréstimo: ");
                String dataEmprestimo = scanner.nextLine();
                emprestimos.add(new Emprestimo(nome, cpf, codigo, dataEmprestimo));
                System.out.println("Empréstimo realizado com sucesso.");
            } else if (opcao == 2) {
                System.out.print("Código do livro: ");
                String codigo = scanner.nextLine();
                Emprestimo emprestimo = buscarEmprestimo(emprestimos, codigo);
                if (emprestimo != null) {
                    System.out.print("Data de devolução: ");
                    String dataDevolucao = scanner.nextLine();
                    emprestimo.setDataDevolucao(dataDevolucao);
                    System.out.println("Livro devolvido com sucesso.");
                } else {
                    System.out.println("Empréstimo não encontrado.");
                }
            } else if (opcao == 3) {
                for (Emprestimo emprestimo : emprestimos) {
                    System.out.println("Pessoa: " + emprestimo.getNome());
                    System.out.println("CPF: " + emprestimo.getCpf());
                    System.out.println("Código do livro: " + emprestimo.getCodigo());
                    System.out.println("Data de empréstimo: " + emprestimo.getDataEmprestimo());
                    if (emprestimo.getDataDevolucao() != null) {
                        System.out.println("Data de devolução: " + emprestimo.getDataDevolucao());

                    } else {
                        System.out.println("Data de devolução: Livro ainda não devolvido");
                    }
                }
            } else if (opcao == 4) {
                break;
            }
        }

        scanner.close();
    }

    public static Emprestimo buscarEmprestimo(ArrayList<Emprestimo> emprestimos, String codigo) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getCodigo().equals(codigo)) {
                return emprestimo;
            }
        }
        return null;
    }
}

class Emprestimo {
    private String nome;
    private String cpf;
    private String codigo;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(String nome, String cpf, String codigo, String dataEmprestimo) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
