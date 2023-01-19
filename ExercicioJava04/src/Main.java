import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número limite para a sequencia de Fibonacci: ");
        int numero = scanner.nextInt();

        //Criando um novo ArrayList para armazenar a sequência de Fibonacci
        List<Integer> fibonacci = new ArrayList<>();

        // Adicionando os dois primeiros números da sequência de Fibonacci na lista
        fibonacci.add(0);
        fibonacci.add(1);

        int proximoNumero = 0;


        // Usando um loop while para gerar a sequência de Fibonacci
        // O loop continuará até que o próximo número na sequência seja maior que o limite especificado pelo usuário
        while (proximoNumero <= numero) {
            proximoNumero = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            if (proximoNumero > numero) {
                // Se o próximo número for maior que o limite, quebra o loop
                break;
            }
            // Adicionando o próximo número à lista
            fibonacci.add(proximoNumero);
        }
        System.out.println("Sequencia de Fibonacci até o " + numero +": " + fibonacci);
    }
}