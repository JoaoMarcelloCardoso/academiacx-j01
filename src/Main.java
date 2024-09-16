import model.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("\nDigite a matricula do aluno: ");
        int matricula = sc.nextInt();

        Aluno aluno = new Aluno(nome,matricula);

        for (int i = 0; i < 3; i++){
            System.out.print("\nDigite a nota da prova " + (i+1) + ": ");
            double nota = sc.nextDouble();

            aluno.addNota(nota);
        }


        System.out.printf("\nMédia do aluno %s: %.2f",aluno.getNome(), aluno.calcularMedia());
    }
}