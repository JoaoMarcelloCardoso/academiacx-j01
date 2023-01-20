package exercicio_4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

	    int n1 = 1;
	    int n2 = 0;
	   
	    System.out.println("Informe um número: ");
	    Scanner scanner = new Scanner(System.in);
	    int input = scanner.nextInt();
	    
	    boolean toggle = true;
	    
	    while(toggle) {
	    	n1 = n1 + n2;
	        n2 = n1 - n2;
	        if(n1 > input) {
	        toggle = false;
	        }
	        else {
	        System.out.println(n1);
	        }
	    }    
	}
}
