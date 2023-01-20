package model;

import java.time.LocalDateTime;
import java.util.Date;

public class Livro {
	private String numero;
	private String nome;
	private String autor;
	private Boolean emprestimo;

	private LocalDateTime dataEmprestimo;
	public Livro(String numero, String nome, String autor) {
		this.numero = numero;
		this.nome = nome;
		this.autor = autor;
		this.emprestimo = false;
	}
	public String getDados(){
		return ("\n[Nome]: "+this.nome+
	            "\n[Autor]: "+this.autor+
				"\n[Numero de Registro]: "+this.numero+
				"\n[Emprestado]: "+this.emprestimo);
	}

	public Boolean getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Boolean emprestimo) {
		this.emprestimo = emprestimo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTelefone() {
		return this.nome + " " + this.numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
}
