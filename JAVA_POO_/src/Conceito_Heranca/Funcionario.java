package Conceito_Heranca;

public class Funcionario extends Gerente { //Final usando na classe restringe a mesma de heran�a. Ent�o impede ser herdada.
public String nome;
protected int idade;
protected float salario;
protected float bonus;

public final int teste =20; //N�o consegue realizar a mudan�a para outro valor da variavel (Constante)
protected float horaExtra(int h, int f) {
	return (h*1.5f)+(f*2f) ;
}
public final void saudacao(){// O m�todo n�op ser� disponivel para realizar o Override.
	System.out.println("Ol�!");
}
}
