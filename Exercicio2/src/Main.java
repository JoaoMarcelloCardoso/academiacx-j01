import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numeros_digitados = new int[5];
        Scanner my_scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros_digitados[i] = my_scanner.nextInt();
        }

        Arrays.sort(numeros_digitados);

        System.out.println("Números digitados em ordem decrescente: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros_digitados[i]);
        }
    }
}