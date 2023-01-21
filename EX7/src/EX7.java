import java.util.*;
import com.academiacx.Livro;
import com.academiacx.Emprestimo;
import com.academiacx.Pessoa;

public class EX7 {
    public static void main(String[] args) {

        int escolha = 1;

        Scanner scanner = new Scanner(System.in);

        Emprestimo novoE = new Emprestimo();
        Livro novoL = new Livro();
        Pessoa novoP = new Pessoa();

        while(escolha != 0){
            System.out.println("\n|~=~=~=~MENU~=~=~=~|\n1-Fazer Emprestimo\n2-Devolução\n3-Lista de Empréstimo\n0-Sair\n|==================|");
            escolha = scanner.nextInt();

            switch (escolha){

                case 0:
                    System.out.println("Ate Mais");
                    break;
                case 1:
                    System.out.println("Digite o codigo do livro: ");
                    novoL.setCodigoLivro(scanner.nextInt());
                    clearBuffer(scanner);
                    System.out.println("Digite o nome do livro: ");
                    novoL.setNomeLivro(scanner.nextLine());
                    System.out.println("Digite o nome do autor: ");
                    novoL.setNomeAutor(scanner.nextLine());
                    System.out.println("Digite o nome de quem esta pegando o livro: ");
                    novoP.setNomePessoa(scanner.nextLine());
                    System.out.println("Digite o celular dela: ");
                    novoP.setCelular(scanner.nextLine());
                    novoE.fazerEmprestimo(novoL.getCodigoLivro(), novoL.getNomeLivro(), novoL.getNomeAutor(),
                            novoP.getNomePessoa(), novoP.getCelular());
                    break;
                case 2:
                    System.out.println("Digite o nome da pessoa que vai devolver: ");
                    novoP.setNomePessoa(scanner.next());
                    System.out.println("Digite o codigo do livro: ");
                    novoL.setCodigoLivro(scanner.nextInt());
                    novoE.devolverLivro(novoP.getNomePessoa(), novoL.getCodigoLivro());
                    break;
                case 3:
                    novoE.consultar();
                    break;
                default:
                    System.out.println("Numero Invalido");
            }
        }
        scanner.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

