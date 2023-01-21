import com.academicx.Cadastro;
import com.academicx.Produto;
import com.academicx.Pessoa;
import java.util.*;

public class Desafio8 {

    public static void main(String[] args) {

        int escolha = 1;
        boolean tentativa = false;

        Scanner scanner = new Scanner(System.in);

        Produto novoP = new Produto();
        Cadastro novoC = new Cadastro();
        Pessoa novoPerson = new Pessoa();

        while(!tentativa){
            System.out.print("Digite o usuario: ");
            String user = scanner.next();
            System.out.print("Digite o senha: ");
            String senha = scanner.next();

            if(user.equals(novoPerson.getUser()) && senha.equals(novoPerson.getSenha())){
                tentativa = true;
            }
                else{
                    if(senha.equals(novoPerson.getSenha())){
                        System.out.println("==================");
                        System.out.println("USUARIO INCORRETO");
                        System.out.println("==================\n");
                    }
                        else if(user.equals(novoPerson.getUser())){
                            System.out.println("==================");
                            System.out.println("SENHA INCORRETA");
                            System.out.println("==================\n");
                        }
                            else{
                                System.out.println("==================");
                                System.out.println("USUARIO E SENHA INCORRETOS");
                                System.out.println("==================\n");
                            }
                }
        }

        while (escolha != 0) {

            System.out.println("\n|MENU|\n1-Cadastrar\n2-Lista de Produtos\n0-Sair");
            escolha = scanner.nextInt();

            switch (escolha) {

                case 0:
                    System.out.println("Ate Mais");
                    break;
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    novoP.setNome(scanner.next());
                    System.out.println("Digite o preço do produto: ");
                    novoP.setPreco(scanner.nextDouble());
                    novoC.addItem(novoP.getNome(), novoP.getPreco());
                    break;
                case 2:
                    novoC.listar();
                    break;
                default:
                    System.out.println("Numero Invalido");
            }
        }
        scanner.close();
    }
}
