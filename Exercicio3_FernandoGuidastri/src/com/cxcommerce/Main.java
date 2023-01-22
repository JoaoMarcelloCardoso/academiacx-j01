package com.cxcommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numeroDigitado = 0;


        while(true){


            System.out.println("Insira o numero");
            numeroDigitado = scanner.nextInt();

            if(numeroDigitado < 0){
                break;
            }
            soma += numeroDigitado;


            System.out.println("\n" + soma);
        }
    }
}