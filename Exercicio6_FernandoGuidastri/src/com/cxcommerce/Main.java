package com.cxcommerce;

import com.cxcommerce.Agenda;
import com.cxcommerce.Contato;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Iniciando agenda ----");


        Agenda agenda = new Agenda();

        String opcao = "";

        while (true) {



            System.out.println();
            System.out.println();
            System.out.println("----- Menu -----:");
            System.out.println("  1 - Exibir agenda completa");
            System.out.println("  2 - Adicionar um contato na agenda");
            System.out.println("  3 - Remover um contato da agenda");
            System.out.println("  0 - Sair");

            opcao = scanner.next();
            if ("0".equals(opcao)){
                break;
            }

            else{


                if ("1".equals(opcao)){
                    agenda.exibirContatos();
                }

                else if ("2".equals(opcao)){
                    System.out.println();
                    System.out.println("Informe os dados a seguir:");
                    System.out.print("    Nome: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.print("    Telefone: ");
                    String telefone = scanner.nextLine();

                    Contato contato = new Contato(nome,telefone);
                    agenda.adicionarContato(contato);
                }

                else if ("3".equals(opcao)){
                    System.out.println();
                    System.out.println("Por favor informe os dados a seguir:");
                    System.out.print("    Telefone: ");
                    scanner.nextLine();
                    String telefone = scanner.nextLine();
                    agenda.remover(telefone);

                    System.out.println("Operação realizada com sucesso");
                }


                else{
                    System.out.println("Opção não encontrada. Tente novamente.");
                }

            }

        }


    }
}