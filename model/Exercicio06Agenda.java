package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06Agenda extends Contato {

    public Exercicio06Agenda(String nome, int numero) {
        super(nome, numero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para adicionar contato digite - 1");

        int adicionarNumero = scanner.nextInt();
        switch (adicionarNumero) {

            case 1:
                ArrayList<Contato> listaContato = new ArrayList<Contato>();

                for (int i = 0; i < 3; i++) {

                    System.out.println("Digite o nome do novo contato:");
                    String nome = scanner.next();

                    System.out.println("Digite o numero do novo contato: ");
                    int numero = scanner.nextInt();

                    listaContato.add(new Contato(nome, numero));
                }
                System.out.println("O numero dos contatos salvos são: "+listaContato);

        }
    }
}
