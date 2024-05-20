package app.musical;

public class Spotfy implements Reprodutor_musical {
	
	@Override
	public void tocar() {
		System.out.println("Tocando musica...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando...");
	}

	@Override
	public void selecionaMusica() {
		System.out.println("Selecionando outra faixa de musica...");
	}

	
}
