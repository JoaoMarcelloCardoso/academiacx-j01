import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor a ser somado: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor a ser somado: ");
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;

        System.out.println("Resultado da soma "+ soma);

        int valorDigitado = 0;
        do {
            valorDigitado = scanner.nextInt();
            if (valorDigitado < 0){
                break;
            }

            soma += valorDigitado;
            System.out.println(soma);
        }
        while (valorDigitado >= 0);
    }
}