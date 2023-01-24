package exercises.exercise_06;
import javax.swing.JOptionPane;
import java.util.HashMap;
import exercises.exercise_06.Contato;

// Para rodar esse exercício, execute o método main() dessa classe
public class Agenda{

    public static void main(String[] args) {
        HashMap<String, Contato> contatos = new HashMap<String, Contato>();
        int option = 0;
        boolean funcionando = true;
        do{
            try{
                option = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Bem vindo a sua agenda telefônica!\nEscolha uma opção:\n1 - Adicionar contato\n2 - Buscar contato\n3 - Listar contatos\n4 - Alterar contato\n5 - Deletar contato\n6 - Sair")
                    );
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                continue;
            }
        
        switch(option){
            case 1:
                Contato contato = new Contato(
                    JOptionPane.showInputDialog(null, "Digite o nome do contato"),
                    JOptionPane.showInputDialog(null, "Digite o telefone do contato"),
                    JOptionPane.showInputDialog(null, "Digite o email do contato")
                );

                contatos.put(contato.getNome(), contato);
                JOptionPane.showMessageDialog(null, "Contato adicionado com sucesso!");
                            
                break;

            case 2:
                if(contatos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Não há contatos cadastrados!");
                }
                else{
                    String stringContatos = "Buscar contato - Digite o nome do contato ou parte dele para buscar\n";
                    String nomeContato = JOptionPane.showInputDialog(null, stringContatos);
                    String resultadoBusca = "";
                    for (String nome : contatos.keySet()) {
                        if(nome.contains(nomeContato)){
                            resultadoBusca += "-" + contatos.get(nome).getNome() + "\n";
                        }
                    };
                    if(resultadoBusca.equals("")){
                        JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!");
                    } else{
                        JOptionPane.showMessageDialog(null, "Contatos encontrados:\n" + resultadoBusca);
                    }
                }


                break;

            case 3:
        
                if(contatos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Não há contatos cadastrados!");
                }
                else{
                    String stringContatos = "";
                    for (String nome : contatos.keySet()) {
                        stringContatos += "-" + contatos.get(nome).getNome() + "\n";
                    };
                    JOptionPane.showMessageDialog(null, "Contatos cadastrados:\n" + stringContatos);
                }  
                break;


            case 4:
                if(contatos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Não há contatos cadastrados!");
                    break;
                }else{
                    String stringContatos = "Alterar contato - Digite o nome do contato que gostaria de apagar\n";
                    for (String nome : contatos.keySet()) {
                        stringContatos += "-" + contatos.get(nome).getNome() + "\n";
                    };
                    String nomeContato = JOptionPane.showInputDialog(null, stringContatos);
                    if(!contatos.containsKey(nomeContato)){
                        JOptionPane.showMessageDialog(null, "Contato não cadastrado!");
                        break;
                    } else{
                        JOptionPane.showMessageDialog(null, contatos.get(nomeContato).toString());
                        String opcao = JOptionPane.showInputDialog(null, "O que você deseja alterar?\n1 - Nome\n2 - Telefone\n3 - Email");
                        switch(opcao){
                            case "1":
                                String novoNome = JOptionPane.showInputDialog(null, "Digite o novo nome");
                                contatos.get(nomeContato).setNome(novoNome);
                                JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!");
                                break;
                            case "2":
                                String novoTelefone = JOptionPane.showInputDialog(null, "Digite o novo telefone");
                                contatos.get(nomeContato).setTelefone(novoTelefone);
                                JOptionPane.showMessageDialog(null, "Telefone alterado com sucesso!");
                                break;
                            case "3":
                                String novoEmail = JOptionPane.showInputDialog(null, "Digite o novo email");
                                contatos.get(nomeContato).setEmail(novoEmail);
                                JOptionPane.showMessageDialog(null, "Email alterado com sucesso!");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida!");
                                break;

                        }
                    }
                    }
                break;

            case 5:
                if(contatos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Não há contatos cadastrados!");
                    break;
                }else{
                    String stringContatos = "Deletar contato - Digite o nome do contato que deseja deletar\n";
                    for (String nome : contatos.keySet()) {
                        stringContatos += "-" + contatos.get(nome).getNome() + "\n";
                    };
                    String nomeContato = JOptionPane.showInputDialog(null, stringContatos);
                    if(!contatos.containsKey(nomeContato)){
                        JOptionPane.showMessageDialog(null, "Contato não cadastrado!");
                        break;
                    } else{
                        contatos.remove(nomeContato);
                        JOptionPane.showMessageDialog(null, "Contato deletado com sucesso!");
                        break;
                    }
                }
                


            case 6:
                System.exit(0);
                funcionando = false;
                break;

            default:
                System.out.println("Opção inválida");JOptionPane.showMessageDialog(null, "Opção Inválida!\nEscolha uma das funções válida no menu");
            } 
        }while(funcionando);
    }
}

