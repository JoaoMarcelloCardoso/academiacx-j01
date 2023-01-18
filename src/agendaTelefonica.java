import java.util.ArrayList;
import java.util.Scanner;

public class agendaTelefonica {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<Object> agenda = new ArrayList<>();

        while (true) {
            System.out.println("Agenda telefonica\n" +
                    "Para inserir contatos digite 'inserir', remover contatos 'remover' \npara finalizar digite 'fim'.");
            System.out.println("==============================================================");
            System.out.println("=  id  =          NOME          =          TELEFONE          =");
            System.out.println("==============================================================");

            for (int i = 1; i <= agenda.size(); i = i + 1) {
                System.out.println("=  " + i + "  =   " + agenda.get(i - 1));
            }

            String escolha = ler.nextLine();

            if ("fim".equalsIgnoreCase(escolha)) {
                break;
            } else if ("inserir".equalsIgnoreCase(escolha)) {

                ArrayList<Object> temp = new ArrayList<>();
                ArrayList<Object> temp2 = new ArrayList<>();

                System.out.println("Insira o Nome do Contato");
                String nome = ler.nextLine();
                temp.add(nome);


                while (true) {

                    System.out.println("Insira o numero");
                    String numero = ler.nextLine();
                    temp2.add(numero);
                    System.out.println("Deseja inserir mais um numero? S/N");
                    String nao = ler.nextLine();

                    if ("n".equalsIgnoreCase(nao)) {
                        break;
                    }
                }

                temp.add(temp2);
                agenda.add(temp);

            } else if ("remover".equalsIgnoreCase(escolha)) {
                if (agenda.size() == 0) {

                    System.out.println("-\n-\n-");
                    System.out.println("Essa agenda está vazia, nenhum contato para remover");
                    System.out.println("-\n-\n-");

                } else {
                    System.out.println("Digite o id do contato a ser deletado: ");
                    int id = ler.nextInt();

                    if (id > 0 || id - 1 <= agenda.size()) {
                        Object h = agenda.get(id - 1);
                        System.out.println("Tem certeza que deseja remover o contato? S/N\n" + h);

                        String rem;
                        rem = ler.next();

                        if ("s".equalsIgnoreCase(rem)) {
                            agenda.remove(id - 1);
                        }
                    } else {
                        System.out.println("\nid inválido\n");
                    }
                }
            }
        }
    }
}
