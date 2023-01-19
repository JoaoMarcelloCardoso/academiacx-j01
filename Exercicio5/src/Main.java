import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner my_scanner = new Scanner(System.in);

        // Pede para o usuário entrar com os dados de 10 pessoas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a sigla do sexo da pessoa (M/F): ");
            String sexo = my_scanner.nextLine();
            System.out.print("Digite a altura da pessoa no formato m.cc: ");
            double altura = Double.parseDouble(my_scanner.nextLine());
            pessoas.add(new Pessoa(sexo, altura));
        }

        // Traz a maior e a menor altura do grupo
        double maiorAltura = pessoas.get(0).altura;
        double menorAltura = pessoas.get(0).altura;
        for (Pessoa p : pessoas) {
            if (p.altura > maiorAltura) maiorAltura = p.altura;
            if (p.altura < menorAltura) menorAltura = p.altura;
        }
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);

        // Mostra a média de altura dos homens
        double somaAlturaHomens = 0;
        int qtdeHomens = 0;
        for (Pessoa p : pessoas) {
            if (p.sexo.equals("M")) {
                somaAlturaHomens += p.altura;
                qtdeHomens++;
            }
        }
        double mediaAlturaHomens = somaAlturaHomens / qtdeHomens;
        System.out.printf("A média de altura dos homens é: %.2f %n",  (mediaAlturaHomens));

        // Mostra na tela o número de mulheres
        int qtdeMulheres = 0;
        for (Pessoa p : pessoas) {
            if (p.sexo.equals("F")) {
                qtdeMulheres++;
            }
        }
        System.out.println("O número de mulheres é: " + qtdeMulheres);
    }
}

