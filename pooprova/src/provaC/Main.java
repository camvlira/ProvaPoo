package provaC;

public class Main {
	public static void main(String[] args) {
		Livro l1 = new Livro("Jogos Vorazes", 400);
		Pessoa p1 = new Pessoa("João", 18);

		l1.imprimirDetalhes();
		p1.imprimirDetalhes();

	}

}
