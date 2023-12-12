package pooprova;

public class Beisebol extends Bola {

	@Override // para não modificar a superclasse (arremessar)
	public void arremessar() {
		System.out.println("Bola de beisebol arremessada...");

	}

	@Override
	public void quicar() {
		System.out.println("Bola de beisebol quicando...");

	}

}
