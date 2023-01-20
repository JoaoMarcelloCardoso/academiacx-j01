import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner numero = new Scanner(System.in);


        int n1, n2 ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero 1:");

        n1 = scanner.nextInt() ;

        System.out.print("Digite o numero 2:");

        n2 = scanner.nextInt() ;
        if(n1<n2) {
            System.out.println("O maior número é o " + n2 + " O menor número é " + n1);

        }

        if(n2<n1){
            System.out.println("O maior número é o " + n1 + " O menor número é " + n2);

        }

    }

}