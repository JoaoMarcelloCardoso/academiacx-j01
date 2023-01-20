package model;

public class Pessoa {
	private String numero;
	private String nome;

	public Pessoa(String numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public String getContato() {
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
