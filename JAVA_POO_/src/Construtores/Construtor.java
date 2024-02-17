package Construtores;

public class Construtor {
public Integer idade;
public Float saldo;
public String nome;

public Construtor() {
	idade=0;
	saldo= 0.0f;
	nome = " ";
}
public Construtor(int idade, float saldo, String nome) {
	this.idade =idade+ 10;
	this.saldo =saldo + 1000f;
	this.nome = nome +" Cliente";
}
}
