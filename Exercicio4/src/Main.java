import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner my_scanner = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        int numero_digitado = my_scanner.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + ", " + b);

        while (b <= numero_digitado) {
            c = a + b;
            if (c > numero_digitado) {
                break;
            }
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}