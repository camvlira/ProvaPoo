package provaD;

abstract class Pessoa {
	public String nome;

	// construtor da classe abstrata
	public Pessoa(String nome) {
		this.nome = nome;

	}

	public abstract void emitirSom();

}
