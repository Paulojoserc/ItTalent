package modulo2;

public class Funcao {
	
	void Hello() { // Fun��o sem retorno e sem par�metros.
		System.out.println("Ol�!");
	}
	void Hello(String nome) { // Fun��o sem retorno e com par�metros.
		System.out.println("Ol�, "+ nome+"!");
	}
	
	String chegada() { //Fun��o com retorno e sem par�metros.
		return "Ol�!";
	}
	
	String chegada(String nome) { //Fun��o com retorno e com par�metros.
		return "Ol�, "+nome+"!!";
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
