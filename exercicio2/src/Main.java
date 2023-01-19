import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int primeiroNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Insira o segundo número: ");
        int segundoNum = Integer.parseInt(scanner.nextLine());

        if (primeiroNum > segundoNum){
            System.out.println(primeiroNum + " " + segundoNum);

        }else {
            System.out.println(segundoNum + " " + primeiroNum);
        }
    }
}