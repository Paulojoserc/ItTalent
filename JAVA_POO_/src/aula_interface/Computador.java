package aula_interface;

public class Computador implements Maquina, Teste{

	@Override
	public void ligar() {
		System.out.println("Computador ligando...");
		
	}

	@Override
	public void desligar() {
		System.out.println("Computador desligando...");
		
	}

	@Override
	public void Testar() {
		System.out.println("Computador sendo testado");
		
	}

}
