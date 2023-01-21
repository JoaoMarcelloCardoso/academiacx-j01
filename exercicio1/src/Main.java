import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3)/3;

        System.out.println("O nome do aluno é " + nomeAluno + " e sua média é " + media);
    }
}