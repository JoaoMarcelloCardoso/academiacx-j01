package model;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio02OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite seu segundo numero: ");
        int num2 = scanner.nextInt();

        if(num1 > num2 ){
            System.out.println("Os numeros em ordem decrescente ficam: "+num1+" , "+num2);
        }
        else if(num2 > num1){
            System.out.println("Os numeros em ordem decrescente ficam: "+num2+" , "+num1);
        }



    }
}
