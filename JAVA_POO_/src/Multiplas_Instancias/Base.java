package Multiplas_Instancias;

public class Base {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setNome("Paulo");
		System.out.println("O nome informado é: " + c.getNome());
		c.consumo = 1090f;
		System.out.println("O seu consumo foi: " + c.consumo);
		c.setAnoNascimento(-1993);
		System.out.println("O ano de nascimento é " + c.getAnoNascimento());

		//Cliente c2 = c;// Esta apontando para o cliente 1
		
		Cliente c2 = new Cliente(); //Aqui estou criando um novo cliente
		c2.setNome("Mauro");// Esta apontando para o cliente 1
		
		System.out.println("Pessoa 1 "+c.getNome());
		System.out.println("Pessoa 2 "+c2.getNome());
	}
}
