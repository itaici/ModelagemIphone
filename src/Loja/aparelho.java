package Loja;

import app.browser.*;
import app.iphone.*;
import app.telefonico.*;
import app.musical.*;


public class aparelho {
  public static void main(String[] args) {
	Iphone aparelho =  new Iphone();
		
	aparelho.ligar();
	aparelho.atender();
	aparelho.correioVoz();
	
	aparelho.tocar();
	aparelho.selecionaMusica();
	aparelho.pausar();
	
    aparelho.exibirPagina();
    aparelho.atualizaPagina();
    aparelho.adicionaAba();

    Safari browser = new Safari();
    
    browser.exibirPagina();
    browser.atualizaPagina();
    browser.adicionaAba();
    
    Spotfy musica = new Spotfy();
    
    musica.tocar();
    musica.selecionaMusica();
    musica.pausar();
    
    
    Telefone siemens  = new Telefone();
    
    siemens.ligar();
    siemens.atender();
    siemens.correioVoz();
    
    
   }
}
