package provaD;

public class Homem extends Pessoa{

	public Homem(String nome) {
		super(nome); //chamando construtor da classe pai 
}

	@Override
	public void emitirSom() {
		System.out.println("Meu nome é " + nome + ".\n");
	
	}	
}
