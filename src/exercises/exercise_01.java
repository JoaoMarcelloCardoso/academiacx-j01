package exercises;

import java.util.Scanner;

import javax.swing.*;

public class exercise_01{
    // Método principal - Descrevendo o exercício e solicitando a opção do usuário para a realização do mesmo
    public static void main(String[] args) {
        System.out.println("Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética).");
        System.out.println("Fazer duas versões do programa, uma usando JOptionPane e outra usando Scanner");
        System.out.println("1 - Usando JOptionPane");
        System.out.println("2 - Usando Scanner");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.close();
        switch (option) {
            case 1:
                exercise_01_JOptionPane();
                break;
            case 2:
                exercise_01_Scanner();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    // Exercício 01 - Realizado com JOptionPane
    public static void exercise_01_JOptionPane(){
        String name = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        String grade1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String grade2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        String grade3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
        double grade1Double = Double.parseDouble(grade1);
        double grade2Double = Double.parseDouble(grade2);
        double grade3Double = Double.parseDouble(grade3);
        double average = (grade1Double + grade2Double + grade3Double) / 3;
        JOptionPane.showMessageDialog(null, "O aluno " + name + " obteve a média " + average);
    } 

    // Exercício 01 - Realizado com Scanner
    public static void exercise_01_Scanner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String name = input.nextLine();
        System.out.println("Digite a primeira nota: ");
        double grade1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double grade2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double grade3 = input.nextDouble();
        double average = (grade1 + grade2 + grade3) / 3;
        System.out.println("O aluno " + name + " obteve a média " + average);
        input.close();

    }
}





  