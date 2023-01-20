package model;

import java.util.Scanner;

public class BackService {
    public void preencherNota(){

        Integer notasPreenchidas = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String  nome = scanner.nextLine();

        Integer nota = 0;
        while (notasPreenchidas < 3){
            System.out.printf("Informe a nota %d do aluno \n", notasPreenchidas+1);
            nota += scanner.nextInt();
            notasPreenchidas++;
        }

        System.out.println("Media do aluno "+nome+": "+nota/3);
    }
}
