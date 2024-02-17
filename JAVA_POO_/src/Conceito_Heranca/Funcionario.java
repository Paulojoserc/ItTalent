package Conceito_Heranca;

public class Funcionario extends Gerente { //Final usando na classe restringe a mesma de herança. Então impede ser herdada.
public String nome;
protected int idade;
protected float salario;
protected float bonus;

public final int teste =20; //Não consegue realizar a mudança para outro valor da variavel (Constante)
protected float horaExtra(int h, int f) {
	return (h*1.5f)+(f*2f) ;
}
public final void saudacao(){// O método nãop será disponivel para realizar o Override.
	System.out.println("Olá!");
}
}
