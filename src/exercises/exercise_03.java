package exercises;

import java.util.Scanner;

public class exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        while (number >= 0) {
            System.out.println("Digite um número: ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("A soma dos números digitados é: " + sum);
        input.close();
    }
}
