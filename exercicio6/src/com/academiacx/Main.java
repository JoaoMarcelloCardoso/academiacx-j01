package com.academiacx;
import com.academiacx.model.Agenda;
import com.academiacx.model.Contato;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Contato> contatos = new ArrayList<Contato>();

        Agenda agenda = new Agenda();

        while(true){
            System.out.println("1. Cadastrar contato");
            System.out.println("2. Mostrar contato");
            System.out.println("0. Sair");
            System.out.print("O que deseja fazer: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            if(opcao == 1){
                agenda.adicionar();
            }

            else if(opcao == 2){
                agenda.mostrar();
            }

            else {
                break;
            }
        }

    }

}


