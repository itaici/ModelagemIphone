package app.telefonico;

public class Telefone implements Aparelho_telefonico {

	@Override
	public void ligar() {
		System.out.println("Ligando...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo...");
		
	}

	@Override
	public void correioVoz() {
		System.out.println("Acessando correio de voz...");
	}

}
