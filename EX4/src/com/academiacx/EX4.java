package com.academiacx;

import java.util.*;

public class EX4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        for (i = 0; i < 40; i++){
            if(EX4Fibonacci.fibo(i) <= num) {
                System.out.print("| (" + i + "):" + EX4Fibonacci.fibo(i) + " |\n");
            }
        }

        scanner.close();
    }
}
