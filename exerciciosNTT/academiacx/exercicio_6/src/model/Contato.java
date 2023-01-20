package model;

public class Contato {
	private String numero;
	private String nome;

	public Contato(String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
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

}
