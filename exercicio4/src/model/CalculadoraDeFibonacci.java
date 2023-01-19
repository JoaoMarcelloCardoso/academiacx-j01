package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraDeFibonacci {

    private int num1 = 0;
    private int num2 = 1;
    private int num3 = 0;
    private int input;
    private List<Integer> sequenciaDeFibonacci = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void calcularSequenciaDeFibonacci(){
        System.out.print("Digite um número: ");
        int input = scanner.nextInt();
        while (num3 <= input ){
            num3 = num1 + num2;

            if (num3 > input){
                break;
            }
            System.out.print(num3 + " ");
            sequenciaDeFibonacci.add(num3);
            this.num1 = num2;
            this.num2 = num3;
        }
        System.out.println("\n\nA Sequência de fibonacci calculada foi: ");
        System.out.println(sequenciaDeFibonacci);
    }

}
