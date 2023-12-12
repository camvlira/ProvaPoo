package provaC;

public class Pessoa implements Imprimivel {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) { //método construtor
		this.nome = nome;
		this.idade = idade;
	}
	@Override
	public void imprimirDetalhes() {
		System.out.println("Pessoa: " + nome + "\nIdade: " + idade);
	}

}