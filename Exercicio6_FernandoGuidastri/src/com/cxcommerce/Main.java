package com.cxcommerce;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Iniciando agenda ----");


        Agenda agenda = new Agenda();

        boolean roda = true;
        int opcao;

        while (roda) {



            System.out.println();
            System.out.println();
            System.out.println("----- Menu -----:");
            System.out.println("  1 - Exibir agenda completa");
            System.out.println("  2 - Adicionar um contato na agenda");
            System.out.println("  3 - Remover um contato da agenda");
            System.out.println("  0 - Sair");

            opcao = scanner.nextInt();


            switch (opcao){
                case 0:
                    roda = false;
                    break;
                case 1:
                    agenda.exibirContatos();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Informe os dados a seguir:");
                    System.out.print("    Nome: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print("    Telefone: ");
                    String telefone = scanner.nextLine();

                    Contato contato = new Contato(nome,telefone);
                    agenda.adicionarContato(contato);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Telefone: ");
                    scanner.nextLine();
                    String telefonex = scanner.nextLine();
                    agenda.remover(telefonex);

                    System.out.println("Operação realizada com sucesso");
                    break;
                default:
                    System.out.println("Opção não encontrada. Tente novamente.");
                    break;





            }


        }


    }
}