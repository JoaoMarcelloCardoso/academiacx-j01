package com.academiacx;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("O seu nome");
        String nome = scanner.nextLine();

        System.out.println("Insira a primeira nota");
        Float nota1 = scanner.nextFloat();

        System.out.println("Insira a segunda nota");
        Float nota2 = scanner.nextFloat();

        System.out.println("Insira a terceira nota");
        Float nota3 = scanner.nextFloat();

        Float media = (nota1 + nota2 + nota3)/3;

        System.out.println(nome + " a sua média foi: " + media);


    }
}