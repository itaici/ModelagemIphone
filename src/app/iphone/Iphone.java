package app.iphone;

import app.browser.Navegador_internet;
import app.musical.Reprodutor_musical;
import app.telefonico.Aparelho_telefonico;

public class Iphone implements Navegador_internet, Reprodutor_musical, Aparelho_telefonico  {

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

	@Override
	public void exibirPagina() {
		System.out.println("Mostrando pagina...");	
	}

	@Override
	public void adicionaAba() {
		System.out.println("Abrindo nova aba...");
	}

	@Override
	public void atualizaPagina() {
		System.out.println("Atualizando pagina...");
	}
    
	
}
