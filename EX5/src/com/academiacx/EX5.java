package com.academiacx;

import java.util.ArrayList;

public class EX5 {
    public static void main(String[] args) {

        double maior = 0, menor = 2;
        double mediaM = 0, somaM = 0;
        int numF = 0, numM = 0;

        EX5Pessoa p1 = new EX5Pessoa();
        EX5Pessoa p2 = new EX5Pessoa();
        EX5Pessoa p3 = new EX5Pessoa();
        EX5Pessoa p4 = new EX5Pessoa();
        EX5Pessoa p5 = new EX5Pessoa();
        EX5Pessoa p6 = new EX5Pessoa();
        EX5Pessoa p7 = new EX5Pessoa();
        EX5Pessoa p8 = new EX5Pessoa();
        EX5Pessoa p9 = new EX5Pessoa();
        EX5Pessoa p10 = new EX5Pessoa();

        double[] altura = new double[10];
        altura[0] = p1.setAltura(1.70);
        altura[1] = p2.setAltura(1.85);
        altura[2] = p3.setAltura(1.53);;
        altura[3] = p4.setAltura(1.80);
        altura[4] = p5.setAltura(1.65);
        altura[5] = p6.setAltura(1.65);
        altura[6] = p7.setAltura(1.95);
        altura[7] = p8.setAltura(1.70);
        altura[8] = p9.setAltura(1.50);
        altura[9] = p10.setAltura(1.67);

        for(int i = 0; i < altura.length; i++){
            if(altura[i] > maior){
                maior = altura[i];
            }
            if(altura[i] < menor) {
                menor = altura[i];}
        }

        String[] sexo = new String[10];
        sexo[0] = p1.setSexo("masculino");
        sexo[1] = p2.setSexo("masculina");
        sexo[2] = p3.setSexo("feminino");;
        sexo[3] = p4.setSexo("feminino");
        sexo[4] = p5.setSexo("masculino");
        sexo[5] = p6.setSexo("masculino");
        sexo[6] = p7.setSexo("masculino");
        sexo[7] = p8.setSexo("feminino");
        sexo[8] = p9.setSexo("masculino");
        sexo[9] = p10.setSexo("feminino");

        for(int i = 0; i <sexo.length; i++) {
            if (sexo[i].equals("feminino")) {
                numF++;
            }
                else if (sexo[i].equals("masculino")) {
                    numM++;
                    somaM += altura[i];
                }
        }

        mediaM = somaM/numM;

        System.out.println("A maior altura foi de " + maior + "cm e a menor foi de " + menor + "cm"
            + "\nA media de altura dos homens foi de: " + mediaM + "cm"
            + "\nO numero de mulheres foi de: " + numF);
    }
}