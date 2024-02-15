package modulo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento_Excecao {
	public static void main(String[] args) {
		String str = "ABC"; // 0 1 2
		String nome = null;
		Scanner sc = new Scanner(System.in);

		try {
			int a = sc.nextInt();
			int x =10/0;
			System.out.println("Tamanho da string nome; " + nome.length());
			System.out.println(str.charAt(3));// Código.
		} catch (StringIndexOutOfBoundsException e) { // chama no do erro
			System.out.println("Posição inválida"); // Tratamento de possiveis exceção
		} catch (NullPointerException e) {
			System.out.println("Não existe nome digitado.");
		}catch(ArithmeticException e ) {
			System.out.println("Não existe divisão por zero");
		}catch(InputMismatchException e ) {
			System.out.println("O número digitado deve ser do tipo inteiro.");
		}catch(Exception e) {
			System.out.println("Exceção genérica");
		}finally {
			System.out.println("Executando Finally");
		}

		sc.close();
	}

}
