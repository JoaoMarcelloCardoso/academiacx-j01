package com.academiacx;

import com.academiacx.model.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<Pessoa> listaDePessoas = new ArrayList<>();
    public static void main(String[] args) {
        gerarConjuntoDeDados();
        calculateAndShowHeightExtremes();
        calculateAndShowMaleHeightAvg();
        calculateAndShowFemaleCount();
    }

    private static void gerarConjuntoDeDados() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.setSexo(random.nextBoolean() ? "Masculino" : "Feminino");
            pessoa.setAltura(random.nextInt(90) + 120);
            listaDePessoas.add(pessoa);
        }
    }

    private static void calculateAndShowHeightExtremes() {
        int maiorAltura = 0;
        int menorAltura = 210;

        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getAltura() > maiorAltura) {
                maiorAltura = pessoa.getAltura();
            }

            if (pessoa.getAltura() < menorAltura) {
                menorAltura = pessoa.getAltura();
            }
        }

        System.out.println("Maior altura do grupo: " + maiorAltura + "cm");
        System.out.println("Menor altura do grupo: " + menorAltura + "cm");
    }

    private static void calculateAndShowMaleHeightAvg() {
        int numeroDeHomens = 0;
        int alturaTotalDeHomens = 0;

        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getSexo().equals("Masculino")) {
                numeroDeHomens++;
                alturaTotalDeHomens += pessoa.getAltura();
            }
        }

        double mediaDeAlturaDeHomens = alturaTotalDeHomens / numeroDeHomens;

        System.out.println("Média de altura dos homens: " + mediaDeAlturaDeHomens + "cm");
    }

    private static void calculateAndShowFemaleCount() {
        int numeroDeMulheres = 0;

        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getSexo().equals("Feminino")) {
                numeroDeMulheres++;
            }
        }

        System.out.println("Número de mulheres: " + numeroDeMulheres);
    }
}