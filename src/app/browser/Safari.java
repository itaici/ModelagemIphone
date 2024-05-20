package app.browser;

public class Safari implements Navegador_internet {

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
