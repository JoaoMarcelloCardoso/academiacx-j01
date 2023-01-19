package com.academiacx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ultimoNumero = 0;

        while (true) {
            try {
                System.out.print("Insira um número inteiro e positivo: ");
                ultimoNumero = scanner.nextInt();

                if (ultimoNumero <= 0) {
                    System.out.println("Insira um valor válido!");
                    continue;
                }

                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Insira um valor válido!");
                scanner.next();
            }
        }


        int numeroAnterior = 1;
        int proximoNumero = 2;
        int soma = 0;

        System.out.print("Sequência de Fibonacci: ");
        while (true) {

            if (numeroAnterior > ultimoNumero) {
                break;
            }

            System.out.print(numeroAnterior + " ");
            soma = numeroAnterior + proximoNumero;
            numeroAnterior = proximoNumero;
            proximoNumero = soma;
        }
    }
}