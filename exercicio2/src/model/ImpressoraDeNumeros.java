package model;

import java.util.Scanner;

public class ImpressoraDeNumeros {
    private Double num1;
    private Double num2;

    public void imprimirNumerosEmOrdemDecrescente(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        this.num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        this.num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num2);
            System.out.println(num1);
        }
    }

}
