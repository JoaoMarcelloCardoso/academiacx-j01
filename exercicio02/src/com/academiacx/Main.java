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
                System.out.print("Digite o primeiro número: ");
            } else {
                System.out.print("Digite o segundo número: ");
            }

            try {
                if (scanner.hasNextInt()) {
                    if (!hasPrimeiroNumero) {
                        primeiroNumero = scanner.nextInt();
                        hasPrimeiroNumero = true;
                    } else {
                        segundoNumero = scanner.nextInt();
                        break;
                    }
                } else {
                    System.out.println("Insira um número válido!");
                    scanner.next();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Insira um número válido!");
                scanner.next();
            }
        } while (true);

        System.out.println("Os números inseridos, em ordem decrescente são: ");
        System.out.println(Math.max(primeiroNumero, segundoNumero));
        System.out.println(Math.min(primeiroNumero, segundoNumero));
    }
}