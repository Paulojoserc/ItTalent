package Multiplas_Instancias;

public class Cliente {
	private String nome;
	private int anoNascimento;
	protected float consumo;
	public String nome2;
	//Get e Set
	
	
	public int getAnoNascimento() {
		return anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoNascimento(int anoNascimento)  {
		if((anoNascimento< 1968) || (anoNascimento>2005)) {
		this.anoNascimento=0;
		}
		this.anoNascimento = anoNascimento;
	}

}
//Public -> Não realiza restrições de acesso a variáveis e/ou a metodos.
//Private -> Atributo ou metodo fica disponivel somente a classe a que pertence.
//protected -> Esta disponivel ao pacote a que pertence.
