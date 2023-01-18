import java.util.ArrayList;
import java.util.Scanner;

public class sequenciaFibonacci {
    public static void main(String[] args) {
        System.out.println("Digite um valor e descubra a sequência de Fibonacci a que ele\n" +
                "pertence ou a sequência anterior mais próxima.");

        int a = 1, b = 0, c, objetivo;
        ArrayList<Integer> sequencia = new ArrayList<>();

        Scanner ler = new Scanner(System.in);
        objetivo = ler.nextInt();
        while (true) {

            if (objetivo <= 0) {
                System.out.println("Número inválido. Digite um número maior que zero.");
            }
            if (a < objetivo) {
                c = a + b;
                if (c < objetivo) {
                    b = a;
                    a = c;
                    sequencia.add(c);

                } else if (c == objetivo) {
                    sequencia.add(c);
                    System.out.println("O número " + objetivo + " pertence a seguinte sequência: \n" + sequencia);
                    break;
                } else {
                    System.out.println("O número " + objetivo + " não pertence a uma sequência.\n" +
                            "A sequência mais próxima é: \n" +
                            sequencia);
                    break;
                }
            }
        }
    }
}
