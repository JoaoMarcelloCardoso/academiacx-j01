import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num = 0;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Insira um número: ");
            num = Integer.parseInt(scanner.nextLine());

            if(num >= 0){
                soma = soma + num;
            }
            else {
                System.out.println(soma);
                break;
            }


        }

    }
}