package provaB;

public class CarroEletrico extends Veiculo implements Eletrico, Conduzivel{
	@Override
	void ligar() {
		System.out.println("Carro elétrico ligado."); 
	}
	@Override
	void desligar() {
		System.out.println("Carro elétrico desligado.");
	}  
	@Override
	public void carregar() {
		System.out.println("Carro elétrico carregando.");
	}
	@Override
	public void dirigir() {
		System.out.println("Dirigindo carro elétrico.");
	}
	
}
