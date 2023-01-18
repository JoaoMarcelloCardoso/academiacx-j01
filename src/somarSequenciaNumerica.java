import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class somarSequenciaNumerica {
    public static void main(String[] args) {
        System.out.println("Insira uma sequencia numérica que o programa efetuará a soma.\n" +
                "Ao inserir um valor negativo o programa irá finalizar.");
        ArrayList<Double> entradas = new ArrayList<>();
        double maior = 0, menor = 0, a, b = 0, c = 0;
        while (true) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Insira um valor");

            a = ler.nextDouble();

            if (a >= 0) {
                if (entradas.size() == 0) {
                    maior = a;
                    menor = a;
                }
                if (a > maior) {
                    maior = a;
                }
                if (a < menor) {
                    menor = a;
                }
                b += a;
                c = a;
                entradas.add(a);
            } else {
                break;
            }
        }
        Collections.sort(entradas);
        System.out.println("Você inseriu " + entradas.size() + " não negativas.\n" +
                "O maior número inserido foi " + maior + " e o menor " + menor + " .\n" +
                "O último valor digitado foi " + a + " .\n" +
                "O último valor positivo digitado foi " + c + " .\n" +
                "A soma total foi de " + b + " .");
    }
}
