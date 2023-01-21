package com.academiacx;

import java.util.*;
public class EX2 {
    public static void main(String[] args) {

        int i = 2;
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros diferentes: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1>num2){
            System.out.printf("\n%d - %d",num1,num2);
        }
            else{
                System.out.printf("\n%d - %d",num2,num1);
            }
    }
}