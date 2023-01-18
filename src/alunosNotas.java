import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alunosNotas {
    public static void main(String[] args) {
        System.out.println("Seus queridos alunos esperam suas notas!\n");
//
        ArrayList<List<String>> boletim = new ArrayList<>();

        while (true) {

            System.out.println("Para inserir notas digite: notas\n" +
                    "Para consultar todos os estudantes e suas médias digite: resultado\n" +
                    "Para encerrar a aplicação digite: sair");

            String nome, escolha;
            double media, nota1, nota2, nota3;
            Scanner ler = new Scanner(System.in);
            escolha = ler.nextLine();

            if ("sair".equalsIgnoreCase(escolha)) {
                break;
            } else if ("notas".equalsIgnoreCase(escolha)) {

                ArrayList<String> parcial = new ArrayList<>();

                System.out.println("Digite o nome do aluno: ");
                nome = ler.nextLine();
                System.out.println("Nota 1: ");
                nota1 = ler.nextDouble();
                System.out.println("Nota 2: ");
                nota2 = ler.nextDouble();
                System.out.println("Nota 3: ");
                nota3 = ler.nextDouble();

                media = Math.round(((nota1 + nota2 + nota3) / 3) * 100) / 100;

                parcial.add(nome);
                parcial.add("P1: " + nota1);
                parcial.add("P2: " + nota2);
                parcial.add("P3: " + nota3);
                parcial.add("Média: " + media);
                boletim.add(parcial);
                System.out.println(parcial);

            } else if ("resultado".equalsIgnoreCase(escolha)) {
                System.out.println(boletim);
            } else {
                System.out.println("Digite uma entrada válida para continuar");
            }
        }
    }
}
