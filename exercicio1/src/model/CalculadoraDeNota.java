package model;

import java.util.Scanner;

public class CalculadoraDeNota {

    private String nomeDoAluno;
    private Double notaProva1;
    private Double notaProva2;
    private Double notaProva3;

    private Double media;


    public void salvarNomeDeEstudante(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        this.nomeDoAluno = in.nextLine();
    }

    public void salvarNotasDoEstudante(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a nota da primeira prova: ");
        this.notaProva1 = in.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        this.notaProva2 = in.nextDouble();
        System.out.print("Digite a nota da terceira prova: ");
        this.notaProva3 = in.nextDouble();

    }

    private void calcularMedia(){
        this.media = (notaProva1 + notaProva2 + notaProva3)/3;
    }



    public void calcularNotaDoEstudante(){
        salvarNomeDeEstudante();
        salvarNotasDoEstudante();
        calcularMedia();
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.println("Média Semestral: " + media);
    }








}
