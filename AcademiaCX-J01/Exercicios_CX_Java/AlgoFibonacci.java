import java.util.Scanner;

public class AlgoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o último valor da sequencia de Fibonacci a ser exibida: ");
        int maxValue = sc.nextInt();
        int fib1 = 0, fib2 = 1, fib3;
        System.out.print(fib1 + " " + fib2 + " ");
        while (fib2 <= maxValue) {
            fib3 = fib1 + fib2;
            if (fib3 > maxValue) {
                break;
            }
            System.out.print(fib3 + " ");
            fib1 = fib2;
            fib2 = fib3;
        }
        System.out.println();
    }
}
