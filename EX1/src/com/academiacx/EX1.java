package com.academiacx;

import java.util.*;
public class EX1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a quatidade de notas do aluno: ");
        int i = scanner.nextInt();

        double[] nota = new double[i];
        double media = 0;

        for(i = 0; i < nota.length; i++){
            System.out.printf("Aluno %s - %dº Nota: ",nome,i+1);
            nota[i] = scanner.nextDouble();
            media += nota[i];
        }

        System.out.printf("\nAluno %s - Media: %f ",nome,media/i);

        scanner.close();
    }
}