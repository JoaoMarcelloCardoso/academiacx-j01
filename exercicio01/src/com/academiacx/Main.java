package com.academiacx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeAluno = scanner.nextLine();

        int notaTotal = 0;

        int notasLidasComSucesso = 0;

        do {
            System.out.print("Digite a nota da " + (notasLidasComSucesso + 1) + "ª prova: ");
            if (scanner.hasNextInt()) {
                try {
                    notaTotal += scanner.nextInt();
                    notasLidasComSucesso++;
                }
                catch (InputMismatchException e) {
                    System.out.println("Digite um número válido!");
                    scanner.next();
                    continue;
                }
            } else {
                System.out.println("Digite um número válido!");
                scanner.next();
            }
        } while (notasLidasComSucesso < 3);


        double mediaAritmetica = notaTotal / 3.0;

        System.out.println("\nAluno: " + nomeAluno);
        System.out.println("Média: " + mediaAritmetica);
    }

}