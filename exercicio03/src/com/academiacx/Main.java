package com.academiacx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int primeiroNumero = 0;
        int segundoNumero = 0;
        boolean hasPrimeiroNumero = false;
        Scanner scanner = new Scanner(System.in);

        do {
            if (!hasPrimeiroNumero) {
                System.out.print("Digite o valor do primeiro número a ser somado (ou um valor negativo para encerrar o programa): ");
            } else {
                System.out.print("Digite o valor do segundo número a ser somado (ou um valor negativo para encerrar o programa): ");
            }

            try {
                if (scanner.hasNextInt()) {
                    if (!hasPrimeiroNumero) {
                        primeiroNumero = scanner.nextInt();
                        if (primeiroNumero < 0) {
                            System.out.println("\nPrograma encerrado!");
                            System.exit(0);
                        }
                        hasPrimeiroNumero = true;
                    } else {
                        segundoNumero = scanner.nextInt();
                        if (segundoNumero < 0) {
                            System.out.println("\nPrograma encerrado!");
                            System.exit(0);
                        }
                        break;
                    }
                } else {
                    System.out.println("Insira um valor válido!");
                    scanner.next();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Insira um valor válido!");
                scanner.next();
            }
        } while (true);

        int soma = primeiroNumero + segundoNumero;

        System.out.println("Soma atual: " + soma);

        int valorAtual = 0;

        do {
            System.out.print("Digite o valor a ser somado (ou um valor negativo para encerrar o programa): ");

            try {
                valorAtual = scanner.nextInt();
                if (valorAtual < 0) {
                    break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Insira um valor válido!");
                scanner.next();
                continue;
            }

            soma += valorAtual;
            System.out.println("Soma atual: " + soma);

        } while (valorAtual >= 0);

        System.out.println("\nPrograma encerrado!");
    }
}