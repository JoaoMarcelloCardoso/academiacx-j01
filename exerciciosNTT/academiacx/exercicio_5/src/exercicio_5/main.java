package exercicio_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class main {

	public static void main(String[] args) {
		
		
		Service service = new Service();
		
		Scanner scanner = new Scanner(System.in);
		Double altura;
		Integer sexo;
		List<Pessoa>  pessoas = new ArrayList<>();
		
		
		for (int i = 0; i < 4; i++) {
	    System.out.println("Informe os dados da pessoa "+(i+1)+":");
	    System.out.println("Informe a altura(Use , para separar os numeros)");
	    altura = scanner.nextDouble();
	    scanner.nextLine();
	    do {
	    System.out.println("Informe o sexo da pessoa");
	    System.out.println("1 - Masculino");
	    System.out.println("2 - Feminino");
	    sexo = scanner.nextInt();
	    }
	    while(sexo >2 || sexo <1);
	    Pessoa pessoa = new Pessoa(altura, sexo);
		
		pessoas.add(pessoa);
		}
		
		service.CalcularAltura(pessoas);
		service.CalcularMediaAltura(pessoas);
		service.CalcularQtdMulheres(pessoas);
		
		System.out.println("A maior altura é: "+ service.getAlturaMaxima());
		System.out.println("A menor altura é: "+ service.getAlturaMinima());
		System.out.println("A média de altura é: "+ service.getMedia());
		System.out.println("A quantidade de mulheres é: "+ service.getQtdMulheres());
	}
}
