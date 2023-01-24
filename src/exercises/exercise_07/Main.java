package exercises.exercise_07;
import exercises.exercise_07.Livro;
import exercises.exercise_07.Emprestimo;
import exercises.exercise_07.Pessoa;
import javax.swing.JOptionPane;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        HashMap livros = getLivros();
        HashMap pessoas = getPessoas();
        HashMap emprestimos = getEmprestimos();
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar livro\n2 - Cadastrar pessoa\n3 - Pessoas cadastradas\n4 - Livros cadastrados\n5 - Pegar livro emprestado\n6 - Devolver livro\n7 - Histórico de empréstimos\n8 - Sair"));
            switch (option) {
                case 1:
                    String titulo = JOptionPane.showInputDialog("Digite o título do livro");
                    String autor = JOptionPane.showInputDialog("Digite o autor do livro");
                    String ano = JOptionPane.showInputDialog("Digite o ano do livro");
                    Livro livro = new Livro(titulo, autor, Integer.parseInt(ano));
                    livros.put(livro.getTitulo(), livro);
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                    
                    break;
                case 2:
                    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
                    String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
                    String email = JOptionPane.showInputDialog("Digite o email da pessoa");
                    Pessoa pessoa = new Pessoa(nome, cpf, email);
                    pessoas.put(pessoa.getNome(), pessoa);
                    JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
                    break;
                case 3:
                    String pessoasCadastradas = "";
                    for (Object pessoaCadastrada : pessoas.values()) {
                        pessoasCadastradas += "-" + pessoaCadastrada + "\n";
                    }
                    JOptionPane.showMessageDialog(null, pessoasCadastradas);
                    break;
                case 4:
                    String livrosCadastrados = "";
                    for (Object livroCadastrado : livros.values()) {
                        livrosCadastrados += "-" + livroCadastrado + "\n";
                    }
                    JOptionPane.showMessageDialog(null, livrosCadastrados);
                    break;
                case 5:
                    String pessoasCadastradasEmprestimo = "";
                    for (Object pessoaCadastrada : pessoas.values()) {
                        pessoasCadastradasEmprestimo += "-" + pessoaCadastrada + "\n";
                    }
                    String nomePessoa = JOptionPane.showInputDialog("Digite o nome da pessoa que irá pegar o livro\n" + pessoasCadastradasEmprestimo);
                    
                    String livrosCadastradosEmprestimo = "";
                    for (Object livroCadastrado : livros.values()) {
                        livrosCadastradosEmprestimo += "-" + livroCadastrado + "\n";
                    }
                    String tituloLivro = JOptionPane.showInputDialog("Digite o título do livro que irá pegar emprestado\n" + livrosCadastradosEmprestimo);
                    Emprestimo emprestimo = new Emprestimo(nomePessoa, tituloLivro);
                    emprestimos.put(emprestimo.getLivro(), emprestimo);                   
                    JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso!");
                    break;

                case 6:
                    String pessoasCadastradasDevolucao = "";
                    for (Object pessoaCadastrada : pessoas.values()) {
                        pessoasCadastradasDevolucao += "-" + pessoaCadastrada + "\n";
                    }
                    String nomePessoaDevolucao = JOptionPane.showInputDialog("Digite o nome da pessoa");
                    String livrosCadastradosDevolucao = "";
                    for (Object livroCadastrado : livros.values()) {
                        livrosCadastradosDevolucao += "-" + livroCadastrado + "\n";
                    }
                    String tituloLivroDevolucao = JOptionPane.showInputDialog("Digite o título do livro");
                    emprestimos.remove(tituloLivroDevolucao);
                    JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso!");
                    break;

                case 7:
                    String historicoEmprestimos = "";
                    for (Object emprestimoCadastrado : emprestimos.values()) {
                        historicoEmprestimos += "-" + emprestimoCadastrado + "\n";
                    }
                    JOptionPane.showMessageDialog(null, historicoEmprestimos);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            
            }
        } while (option != 8);
    }


    public static HashMap<String, Livro> getLivros() {
        HashMap<String, Livro> livros = new HashMap<String, Livro>();
        livros.put("1", new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livros.put("2", new Livro("O Hobbit", "J.R.R. Tolkien", 1937));
        livros.put("3", new Livro("O Silmarillion", "J.R.R. Tolkien", 1977));
        return livros;
    }

    public static HashMap<String, Pessoa> getPessoas() {
        HashMap<String, Pessoa> pessoas = new HashMap<String, Pessoa>();
        pessoas.put("1", new Pessoa("Fulano", "123456789", "fulano@gmail.com"));
        pessoas.put("2", new Pessoa("Beltrano", "987654321", "beltrano@gmail.com"));
        pessoas.put("3", new Pessoa("Ciclano", "123987456", "ciclano@gmail.com"));
        return pessoas;
    }

    public static HashMap<String, Emprestimo> getEmprestimos() {
        HashMap<String, Emprestimo> emprestimos = new HashMap<String, Emprestimo>();
        emprestimos.put("1", new Emprestimo("Fulano", "O Senhor dos Anéis"));
        emprestimos.put("2", new Emprestimo("Beltrano", "O Hobbit"));
        return emprestimos;
    }
}