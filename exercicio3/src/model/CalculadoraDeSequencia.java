package model;

import java.util.Scanner;

public class CalculadoraDeSequencia {
    private Double soma = 0D;
    private Double input;
    private Scanner scanner = new Scanner(System.in);

    public void calcularSequencia(){
        System.out.println("---!       Calculadora de sequência      !---");
        System.out.println("Para encerrar o programa digite um valor negativo");
        do {
            System.out.print("Digite um número: ");
            this.input = scanner.nextDouble();
            if (input >= 0){
                this.soma += input;
                System.out.println("Soma: " + soma);
            } else {
                System.out.println("---x     Calculadora de sequência encerrada     x----");
            }

        } while (input >= 0);
    }

}
