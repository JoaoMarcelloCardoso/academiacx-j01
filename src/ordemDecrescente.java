import java.util.Scanner;

public class ordemDecrescente {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Insira dois valores que o retornaremos de forma decrescente");

            int a, b;

            Scanner ler = new Scanner(System.in);

            System.out.println("Insira o  primeiro valor: ");
            a = ler.nextInt();
            System.out.println("Insira o  segundo valor: ");
            b = ler.nextInt();

            if (a > b) {
                System.out.println(b + ", " + a);
            } else if (b > a) {
                System.out.println(a + ", " + b);
            } else {
                System.out.println(a + ", " + b);
            }

            System.out.println("Deseja continuar? S/N ");

            String sair = ler.nextLine();

            if ("n".equalsIgnoreCase(sair)) {
                break;
            }
        }
    }
}
