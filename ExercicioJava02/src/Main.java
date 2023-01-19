import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[2];

        System.out.println("Olá!");

        for (int i = 0; i < 2; i++){
            System.out.print("\nDigite o número " + (i+1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        Arrays.sort(numeros);

        System.out.printf("\nNúmeros em ordem decrescente: %.1f e %.1f",numeros[1],numeros[0]);
    }
}