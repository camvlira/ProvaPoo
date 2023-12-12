package exemploEstatico;

class Exemplo {
    void metodo1(int x) {
        System.out.println("Método com um parâmetro: " + x);
    }

    void metodo1(int x, int y) {
        System.out.println("Método com dois parâmetros: " + x + ", " + y);
    }

	public static void main(String []args) {
		Exemplo m1 = new Exemplo();
		
        m1.metodo1(10);        
        m1.metodo1(5, 5);
		
		}
	}
		
	