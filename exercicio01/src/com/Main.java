import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner nota = new Scanner(System.in);


        int n1, n2, n3, mf;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = scanner.nextLine() ;

        System.out.print("Digite sua primeira nota: ");

        n1 = nota.nextInt();

        System.out.print("Digite sua segunda nota:" );
        n2 = nota.nextInt();

        System.out.print("Digite sua terceira nota: ");

        n3 = nota.nextInt();

        mf = (n1+n2+n3)/3;
        if(mf >=5)
        {
            System.out.print("Voce foi aprovado. ");
        }
        else
        {
            System.out.print("Voce foi reprovado. ");
        }
        System.out.print( nome + " A media final é de: " + mf + " pontos.");
    }
}