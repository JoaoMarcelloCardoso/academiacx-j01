import model.entities.Pessoa;
import model.enums.Sexo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa;

        List<Pessoa> list = new ArrayList<>();

        list.add(new Pessoa(1.75, Sexo.MASCULINO));
        list.add(new Pessoa(1.87, Sexo.MASCULINO));
        list.add(new Pessoa(1.65, Sexo.FEMININO));
        list.add(new Pessoa(1.68, Sexo.FEMININO));
        list.add(new Pessoa(1.88, Sexo.MASCULINO));
        list.add(new Pessoa(1.77, Sexo.FEMININO));
        list.add(new Pessoa(1.58, Sexo.FEMININO));
        list.add(new Pessoa(1.70, Sexo.FEMININO));
        list.add(new Pessoa(1.78, Sexo.MASCULINO));
        list.add(new Pessoa(1.79, Sexo.MASCULINO));

        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double mediaAlturaHomens = 0;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;


        for (Pessoa p : list) {
            if (p.getAltura() > maiorAltura) {
                maiorAltura = p.getAltura();
            }
            if (p.getAltura() < menorAltura) {
                menorAltura = p.getAltura();
            }
            if (p.getSexo().equals(Sexo.MASCULINO)) {
                mediaAlturaHomens += p.getAltura();
                quantidadeHomens++;
            } else {
                quantidadeMulheres++;
            }
        }


        mediaAlturaHomens /= quantidadeHomens;


        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.printf("Média de altura dos homens: %.2f", mediaAlturaHomens);
        System.out.println("\nQuantidade de mulheres: " + quantidadeMulheres);
    }
}