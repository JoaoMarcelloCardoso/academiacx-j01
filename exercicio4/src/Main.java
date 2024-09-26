import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> fibo = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        fibo.add(0);
        fibo.add(1);

        System.out.println("Insira o valor máximo da sequência: ");
        int n = scanner.nextInt();

        int prox = 0;

        while (prox <= n) {
            prox = fibo.get(fibo.size() - 1) + fibo.get(fibo.size() - 2);
            if (prox > n) {
                break;
            }
            fibo.add(prox);

        }
        System.out.println(fibo);
    }


}
