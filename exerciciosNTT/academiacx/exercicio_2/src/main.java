import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidadeNumeros;
		
		System.out.println("Informe quantos numeros adicionar: ");
		quantidadeNumeros = scanner.nextInt();
		
		int[] array = new int[quantidadeNumeros];
		
		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.println("Informe o numero " + (i+1) + ":");
			int aux = scanner.nextInt();
			array[i] = aux;
		}
		
		System.out.println("Array sem ordenacao:");
		
		for (int n : array) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] > array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		
		System.out.println("Array em ordem decrescente:");
		for (int n : array) {
			System.out.print(n + " ");
		}
	}
}
