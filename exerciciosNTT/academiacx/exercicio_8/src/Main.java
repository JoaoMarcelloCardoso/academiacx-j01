import java.util.Scanner;
import model.*;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Backend backend = new Backend();

        String user;
        String password;
        int opcao;
        do {
            System.out.printf("**** Menu Principal *****\n");
            System.out.printf(" BACKOFFICE\n");
            System.out.printf(" 1 -ACESSAR SISTEMA\n");
            System.out.printf(" 0 - Encerrar o Programa\n");
            System.out.printf("\nOpção Desejada: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    do {
                        System.out.println("Informe usuario:");
                        user =  scanner.nextLine();
                        System.out.println("Informe a senha:");
                        password = scanner.nextLine();
                    }while (!backend.login(user, password));
                        backend.menu();
                    break;
            }

            System.out.printf("\n\n");

        } while (opcao != 0);
    }
}