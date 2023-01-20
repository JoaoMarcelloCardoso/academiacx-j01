package com.cxcommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        float menorAltura = 0;
        float maiorAltura = 0;
        float alturaHomem = 0;
        int mulher = 0;
        int homem =  0;


        for(int i = 0; i<4; i++){

            System.out.println("Insira o sexo\n1-Homem // 2-Mulher");
            int sexo = scanner.nextInt();

            System.out.println("Insira a altura");
            float altura = scanner.nextFloat();


            if(sexo == 1){

                alturaHomem += altura;
                homem++;

            }else{

                mulher++;
            }

            if(altura > maiorAltura){

                maiorAltura = altura;
            }

            if(i == 0){

                menorAltura = altura;
            }

            if(menorAltura > altura){

                menorAltura = altura;
            }



        }

        System.out.println("A maior altura: " + maiorAltura + " a menor altura: " + menorAltura + "\n");
        System.out.println("A media de altura foi " + (alturaHomem/homem) + "\n");
        System.out.println("O número de mulheres é: " + mulher);

    }
}