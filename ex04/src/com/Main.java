
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Insira o número máximo de sequência");
        int numeroMaximo = scanner.nextInt();


        int n1 = 1;
        int n2 = 0;
        int fibo = 0;

        while (fibo<=numeroMaximo){
            System.out.println(fibo);

            fibo=(n1+n2);
            n2=n1;
            n1=fibo;




        }



    }
}