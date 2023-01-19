package com.academiacx;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro numero");
        Integer valor1 = scanner.nextInt();

        System.out.println("\nSegundo numero");
        Integer valor2 = scanner.nextInt();

        if(valor1 >= valor2) {

            System.out.println("\n" + valor1);
            System.out.println(valor2);
            return;
        }


        System.out.println( "\n" + valor2);
        System.out.println(valor1);


    }
}