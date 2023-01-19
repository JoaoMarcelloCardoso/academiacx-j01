import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero_digitado, soma = 0;
        Scanner my_scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero_digitado = my_scanner.nextInt();

        while(numero_digitado >= 0){
            soma += numero_digitado;
            System.out.print("Digite um número: ");
            numero_digitado = my_scanner.nextInt();
        }

        System.out.println("Soma: " + soma);
    }
}
