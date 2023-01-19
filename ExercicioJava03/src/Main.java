import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double numero = 0, soma = 0;

        while (numero >= 0){
            System.out.println("Digite um número (Para encerrar digite um número negativo): ");
            numero = sc.nextDouble();

            if (numero >= 0){
                soma+= numero;
            }
        }

        System.out.printf("Soma de todos os números: ", soma);
    }
}