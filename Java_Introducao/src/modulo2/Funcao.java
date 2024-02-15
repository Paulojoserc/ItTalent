package modulo2;

public class Funcao {
	
	void Hello() { // Função sem retorno e sem parâmetros.
		System.out.println("Olá!");
	}
	void Hello(String nome) { // Função sem retorno e com parâmetros.
		System.out.println("Olá, "+ nome+"!");
	}
	
	String chegada() { //Função com retorno e sem parâmetros.
		return "Olá!";
	}
	
	String chegada(String nome) { //Função com retorno e com parâmetros.
		return "Olá, "+nome+"!!";
	}
	public static void main(String[] args) {
		
		new Funcao().Hello();
		new Funcao().Hello("Felipe");
		String x = new Funcao().chegada();
		System.out.println(x);
		String y = new Funcao().chegada("Felipe");
		System.out.println(y);
	}
}
