package Encapsulamento_E_Metodos;
public class Main {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		System.out.println("Seu nome �: "+p.nome);
		System.out.println("Voc� nasceu em: "+p.ano_nascimento);
		p.falar();
		p.ano();

	}
}

//Pessoa -> Tipo do Objeto (Classe)
// p -> O espa�o que representa a classe Pessoa.
// New Pessoa() -> O espa�o de mem�ria que � reservado para o objeto p.