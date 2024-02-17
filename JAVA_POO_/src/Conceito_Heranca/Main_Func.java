package Conceito_Heranca;

public class Main_Func {
	public static void main(String[] args) {
		Operario op = new Operario();
		op.nome = "Marcos";
		op.idade = 19;
		op.salario = 1456f;
		op.bonus = 300f;
		float h = op.horaExtra(10, 10);
		System.out.println("O ganho do funcionario " + op.nome + "é de: " + (op.salario + op.bonus + h));
		op.saudacao();
		System.out.println(op.teste);
		
		
		System.out.println(Categorias.SENIOR);
	}
}
