package modulo3;

import java.util.Scanner;

public class Entrada_Matrizes {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o número de linhas: ");
	int l = sc.nextInt();
	System.out.print("Digite o número de colunas: ");
	int c = sc.nextInt();
	
	int [][] matriz = new int[l][c];
	System.out.println("Digite os elementos da Matriz:");
	System.out.println("O total de elementos a ser digitados são:"+(l*c));
	for (int i = 0; i < l; i++) {
		for (int j = 0; j < c; j++) {
			matriz[i][j] = sc.nextInt();
		}
		
	}
	System.out.println("Matriz lida, agora vamos imprimi-la");
	for (int i = 0; i < l; i++) {
		for (int j = 0; j < c; j++) {
			System.out.print(matriz[i][j]+" ");
		}
		System.out.println();
	}
	sc.close();
}
}
