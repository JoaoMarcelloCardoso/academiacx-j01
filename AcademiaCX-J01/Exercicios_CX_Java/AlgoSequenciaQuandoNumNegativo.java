import java.util.Scanner;

public class AlgoSequenciaQuandoNumNegativo {

     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num, sum = 0;
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            while (num >= 0) {
                sum += num;
                System.out.print("Digite outro número: ");
                num = sc.nextInt();
            }
            System.out.println("A soma dos números é: " + sum);
        }
    }