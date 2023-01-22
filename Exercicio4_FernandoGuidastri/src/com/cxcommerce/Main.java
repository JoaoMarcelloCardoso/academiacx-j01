package com.cxcommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero da sequencia de Fibonacci");
        int numeroInserido = scanner.nextInt();
        int fibonacci = 0;
        int num1 = 1;
        int num2 = 0;

        while (fibonacci <= numeroInserido){

            System.out.print(fibonacci + " ");

            fibonacci = (num1 + num2);
            num2 = num1;
            num1 = fibonacci;



        }


    }
}


