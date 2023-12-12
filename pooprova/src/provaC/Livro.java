package provaC;

public class Livro implements Imprimivel {
	private String titulo; //atributos
	private int paginas;
	
	public Livro(String titulo, int paginas) { //método construtor
		this.titulo = titulo;
		this.paginas = paginas;
	}
	@Override
	public void imprimirDetalhes() {
		System.out.println("Livro: " + titulo + "\nPáginas: " + paginas);
	}

}




