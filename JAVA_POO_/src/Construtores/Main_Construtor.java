package Construtores;

import Multiplas_Instancias.Cliente;

public class Main_Construtor {
public static void main(String[] args) {
	Construtor c2 = new Construtor(15,1500f,"Paulo");
	System.out.println(c2.idade);
	System.out.println(c2.nome);
	System.out.println( c2.saldo);
	
	Construtor c = new Construtor();
	System.out.println(c.idade);
	System.out.println(c.nome);
	System.out.println( c.saldo);
	
	new Cliente();
	Cliente c1 = new Cliente();
	c1.nome2 = "Teste";
	System.out.println(c1.nome2);
}
}
