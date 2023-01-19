import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Primeira Nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Segunda Nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Terceira Nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
    }
}