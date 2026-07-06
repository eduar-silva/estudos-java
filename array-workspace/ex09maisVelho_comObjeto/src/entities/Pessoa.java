package entities;

public class Pessoa {
	private int idade;
	private String nome;
	
	public Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}
}
