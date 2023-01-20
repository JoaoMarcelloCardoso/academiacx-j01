import java.util.Scanner;


    public class LeiaNota {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Nota da primeira prova: ");
            double nota1 = sc.nextDouble();

            System.out.print("Nota da segunda prova: ");
            double nota2 = sc.nextDouble();

            System.out.print("Nota da terceira prova: ");
            double nota3 = sc.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("Nome do aluno: " + nome);
            System.out.println("Média = " + media);
        }
    }
