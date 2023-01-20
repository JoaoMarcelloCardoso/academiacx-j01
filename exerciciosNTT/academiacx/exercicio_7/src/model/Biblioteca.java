package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	static Scanner scanner = new Scanner(System.in);
	private List<Livro> livros;
	private List<Pessoa> pessoas;


	public Biblioteca() {
		this.livros = new ArrayList<>();
		this.pessoas = new ArrayList<>();
	}

	public Pessoa pesquisarSócio(List<Pessoa> pessoas, String nome) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getNome().equals(nome.toUpperCase())) {
				System.out.println("Contato: " + pessoa.getContato());
				return pessoa;
			}
		}
		return null;
	}

	public Livro pesquisarLivro(List<Livro> livros, String nome) {
		for (Livro livro : livros) {
			if (livro.getNome().equals(nome.toUpperCase())) {
				return livro;
			}
		}
		return null;
	}

	public void listarLivros(List<Livro> livros) {
		int i = 1;
		for (Livro livro : livros) {
				System.out.println("Posição ["+(i)+"]"+livro.getDados());
				i++;
		}
	}
	public void listarSócios(List<Pessoa> pessoas) {
		int i = 1;
		for (Pessoa pessoa : pessoas) {
			System.out.println("Posição [" + (i) + "]" + pessoa.getContato());
			i++;
		}
	}

		public boolean emprestarLivro(List<Livro> livros,String nomeLivro, List<Pessoa> pessoas,String nomeSocio) {
		Livro encontrado = pesquisarLivro(livros, nomeLivro);
		Pessoa pessoaAchada = pesquisarSócio(pessoas, nomeSocio);
		if (encontrado != null && pessoaAchada != null){
			encontrado.setEmprestimo(true);
			encontrado.setDataEmprestimo(LocalDateTime.now());
			System.out.println("Empréstimo concluido com sucesso!");
			return true;
		}
		else {
			System.out.println("Falha na busca!");
			return false;
		}
	}
	public boolean devolverLivro(List<Livro> livros,String nomeLivro) {
		Livro encontrado = pesquisarLivro(livros, nomeLivro);
		if (encontrado != null){
			encontrado.setEmprestimo(false);
			System.out.println("Livro devolvido com sucesso");
			return true;
		}
		else {
			System.out.println("Erro na entrega do livro");
			return false;
		}
	}
	public void addPessoa(String nome, String telefone) {
		Pessoa pessoa = new Pessoa(telefone, nome.toUpperCase());
		pessoas.add(pessoa);
		System.out.println("Sócio cadastrado com sucesso");
	}
	public void addLivro(String numero, String nome, String autor){
		Livro livro = new Livro(numero, nome.toUpperCase(), autor.toUpperCase());
		livros.add(livro);
		System.out.println("Livro cadastrado com sucesso");
	}

	public void listarEmpréstimos(List<Livro> livros) {
		List<Livro> empréstimos = new ArrayList<>();
		for (Livro livro : livros) {
			if (livro.getEmprestimo().equals(true)) {
				empréstimos.add(livro);
			}
		}
		if (!empréstimos.isEmpty()){
			listarLivros(empréstimos);
		}
	}

	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}
