import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int sexo;
        int qtMulheres = 0;
        int qtHomens = 0;
        float somaH = 0;
        float maior = 0;
        float altura = 0;
        float menor = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
            sexo = entrada.nextInt();
            System.out.print("Digite a altura: ");
            altura = entrada.nextFloat();
            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            } else {
                System.out.println("Opção digitada inválida!");
            }
            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }

        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " +  altura/qtHomens + " m");
        System.out.println("O número de mulheres é " + qtMulheres);
    }
}
