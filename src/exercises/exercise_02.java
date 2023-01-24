package exercises;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercise_02 {
    public static void main(String[] args) {
        System.out.println("Entrar com dois números e imprimi-los em ordem decrescente (suponha números diferentes).");
        System.out.println("Fazer da mesma maneira com JOptionPane e com Scanner");
        System.out.println("1 - Usando JOptionPane");
        System.out.println("2 - Usando Scanner");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.close();
        switch (option) {
            case 1:
                exercise_02_JOptionPane();
                break;
            case 2:
                exercise_02_Scanner();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    // Exercício 02 - Realizado com JOptionPane
    public static void exercise_02_JOptionPane(){
        String number1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String number2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        double number1Double = Double.parseDouble(number1);
        double number2Double = Double.parseDouble(number2);
        if (number1Double > number2Double) {
            JOptionPane.showMessageDialog(null, "Os números em ordem decrescente são: " + number1Double + " e " + number2Double);
        } else {
            JOptionPane.showMessageDialog(null, "Os números em ordem decrescente são: " + number2Double + " e " + number1Double);
        }
    }

    // Exercício 02 - Realizado com Scanner
    public static void exercise_02_Scanner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double number1 = input.nextDouble();
        System.out.println("Digite o segundo número: ");
        double number2 = input.nextDouble();
        if (number1 > number2) {
            System.out.println("Os números em ordem decrescente são: " + number1 + " e " + number2);
        } else {
            System.out.println("Os números em ordem decrescente são: " + number2 + " e " + number1);
        }
        input.close();
    }

    
    
}
