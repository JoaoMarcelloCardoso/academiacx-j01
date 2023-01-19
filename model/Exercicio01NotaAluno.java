package model;

import java.util.Scanner;

public class Exercicio01NotaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float notas[] = new float[10];

        System.out.println("Qual o seu nome ?");
        String nome = scanner.nextLine();

        System.out.println("Olá "+ nome +" entre com a sua primeira nota:" );
        notas[1] = scanner.nextFloat();

        System.out.println( nome + " entre com a sua segunda nota:" );
        notas[2] = scanner.nextFloat();

        System.out.println( nome + " entre com a sua terceira nota:" );
        notas[3] = scanner.nextFloat();

        float totalNotas =  notas[1] + notas[2] + notas[3] / 3;

        System.out.printf( nome + " sua média aritmetica é %.1f:" , totalNotas);

    }

}
