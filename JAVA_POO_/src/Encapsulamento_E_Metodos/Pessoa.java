package Encapsulamento_E_Metodos;

public class Pessoa {
	public String nome = "Rafael";
	public int ano_nascimento = 1990;
	
	void falar() {
		System.out.println("Ol�, meu nome �: "+nome);
	}
	
	void ano() {
		System.out.println("Eu nasci em: "+ano_nascimento);
	}
}
