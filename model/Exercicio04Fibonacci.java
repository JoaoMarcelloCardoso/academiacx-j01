package model;

import java.util.Scanner;

public class Exercicio04Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a entrada: ");
        int entrada = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;
        do {
            System.out.print(num1 + " ");
            int fib = num1 + num2;
            num1 = num2;
            num2 = fib;
        } while (num1 <= entrada);

    }
}
