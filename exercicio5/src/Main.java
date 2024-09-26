import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String genero;
        double altura;

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();


        Scanner scanner = new Scanner(System.in);

        // Inserindo pessoas
        for(int i = 0; i < 2; i++){
            System.out.println("Digite 'm' para masculino e 'f' para feminino: ");
            genero = scanner.nextLine();
            System.out.println("Insira a altura: ");
            altura = Double.parseDouble(scanner.nextLine());
            pessoas.add(new Pessoa(genero, altura));
        }

        // Calculando número de mulheres
        int numeroMulheres = 0;

        for(Pessoa p : pessoas) {
            if(p.genero.equals("f")){
               numeroMulheres++;
            }
        } System.out.println("O número total de mulheres é " + numeroMulheres);


        // Calculando maior altura
        double maior = pessoas.get(0).altura;
        for (int i = 1; i < pessoas.size(); i++) {
            if (maior < pessoas.get(i).altura) {
                maior = pessoas.get(i).altura;
            }
        }System.out.println("A maior altura é = " + maior);


        // Calculando menor altura
        double menor = pessoas.get(0).altura;
        for (int i = 1; i < pessoas.size(); i++) {
            if (menor > pessoas.get(i).altura) {
                menor = pessoas.get(i).altura;
            }
        }System.out.println("A menor altura é = " + menor);


        // Calculando média de altura dos homens
        double media = 0;
        double total = 0;
        int contador = 0;

        for(int i = 0; i < pessoas.size(); i++){
            if(pessoas.get(i).genero.equals("m")) {
                contador++;
                total += pessoas.get(i).altura;
                media = total / contador;
            }
        }
        System.out.println("A média das alturas dos homens é " + media);
    }

}




