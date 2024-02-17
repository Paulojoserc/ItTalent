import Multiplas_Instancias.Cliente;

public class Main {
	public static void main(String[] args) {
		new Cliente();
		Cliente c1 = new Cliente();
		
		c1.nome2 = "Teste";
		System.out.println(c1.nome2);
	}
}