package exercises;

import java.util.Scanner;

public class exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = input.nextInt();
        int first = 1;
        int second = 2;
        int sum = 0;
        System.out.print(first + ", " + second);
        while (sum <= number) {
            sum = first + second;
            if (sum <= number) {
                System.out.print(", " + sum);
            }
            first = second;
            second = sum;
        }
        input.close();
    }
}