package pooprova;

public class Main {

	public static void main(String[] args) {
		Futebol bolafut = new Futebol();
		bolafut.arremessar();
		bolafut.quicar();
		bolafut.marca = "Adidas";
		
		Beisebol bolabei =  new Beisebol();
		bolabei.arremessar();
		bolabei.quicar();
		bolabei.marca = "Nike"; 
		
	}
}
