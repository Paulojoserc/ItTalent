package Encapsulamento_E_Metodos;
public class Main {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		System.out.println("Seu nome é: "+p.nome);
		System.out.println("Você nasceu em: "+p.ano_nascimento);
		p.falar();
		p.ano();

	}
}

//Pessoa -> Tipo do Objeto (Classe)
// p -> O espaço que representa a classe Pessoa.
// New Pessoa() -> O espaço de memória que é reservado para o objeto p.