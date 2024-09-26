package com.academiacx.model;

import java.util.ArrayList;
import java.util.Scanner;
public class Agenda {

    String nome;
    String numero;
    String email;

    Scanner scanner = new Scanner(System.in);
    ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void adicionar(){
        System.out.println("Insira o nome do seu contato: ");
        String nome = scanner.nextLine();

        System.out.println("Insira o numero do seu contato: ");
        String numero = scanner.nextLine();

        System.out.println("Insira o email do seu contato: ");
        String email = scanner.nextLine();
        contatos.add(new Contato(nome, numero, email));
    }
    public void mostrar(){
        for(int i = 0; i < contatos.size(); i++){
            System.out.println(contatos.get(i));
        }
    }
}
