package com.academiacx;

import java.util.*;
public class EX3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double num = 0;

        while(num >= 0){
            System.out.println("Digite um numero qualquer: ");
            num = scanner.nextDouble();

            if(num >= 0){
                soma += num;
            }
                else{
                    break;
                }
        }

        System.out.println("Soma dos numeros digitados: " + soma);

        scanner.close();
    }
}