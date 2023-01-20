import java.util.Scanner;

public class CalculoAltura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalAltura = 0;
        int countHomem = 0;
        int countMulher = 0;
        double maxAltura = Double.MIN_VALUE;
        double minAltura = Double.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
                System.out.print("Digite a altura da pessoa " + i + ": ");
                double altura = sc.nextDouble();
                System.out.print("Digite o sexo (M para masculino, F para feminino) da pessoa " + i + ": ");
                String gender = sc.next();
                if (gender.equalsIgnoreCase("M")) {
                    totalAltura += altura;
                    countHomem++;
                } else if (gender.equalsIgnoreCase("F")) {
                    countMulher++;
                }
                if (altura > maxAltura) {
                    maxAltura = altura;
                }
                if (altura < minAltura) {
                    minAltura = altura;
                }
        }
        double alturaMediaHomem = totalAltura / countHomem;
        System.out.println("A maior altura é: " + maxAltura);
        System.out.println("A menor altura é: " + minAltura);
        System.out.println("A média de altura dos homens é: " + alturaMediaHomem);
        System.out.println("O número de mulheres é: " + countMulher);
    }
}