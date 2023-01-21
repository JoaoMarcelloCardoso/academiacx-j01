import java.util.*;
import com.academiacx.Contato;
import com.academiacx.Agenda;
public class EX6 {
    public static void main(String[] args) {

        int escolha = 1;

        Scanner scanner = new Scanner(System.in);
        Agenda novoA = new Agenda();
        Contato novoC = new Contato();

        while (escolha != 0) {
            System.out.println("\nMENU\n1-Adicionar Contato\n2-Remover Contato\n3-Ver Todos os Contatos\n0-Sair");
            escolha = scanner.nextInt();

            switch (escolha) {

                case 0:
                    System.out.println("Ate Mais");
                    break;
                case 1:
                    System.out.println("Digite as informações \nNome: ");
                    novoC.setNome(scanner.next());
                    System.out.println("Digite as informações \nCelular: ");
                    novoC.setCelular(scanner.next());
                    System.out.println("Digite as informações \nEmail: ");
                    novoC.setEmail(scanner.next());
                    novoA.addPessoas(novoC.getNome().toUpperCase(),novoC.getCelular(),novoC.getEmail());
                    break;
                case 2:
                    System.out.println("Digite o nome que deseja exluir: ");
                    novoC.setNome(scanner.next());
                    novoA.delAgenda(novoC.getNome().toUpperCase());
                    break;
                case 3:
                    novoA.mostrarAgenda();
                    break;
                default:
                    System.out.println("Numero Invalido");
            }
        }
        scanner.close();
    }
}