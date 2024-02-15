package modulo3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tratamento_Arquivo {
public static void main(String[] args) {
	//String caminhiArquivo ="D:\\projetosEclipse\\ItTalent\\Java_Introducao\\src\\modulo3\\Teste.txt";
	String caminhiArquivo ="D:\\Teste2.txt";
	try {
		FileReader arquivoReader = new FileReader(caminhiArquivo);//Destaca um caminho do arquivo a ser lido.
		BufferedReader leitor = new BufferedReader(arquivoReader);//Reraliza a otimização da leitura do arquivo.
		String linha;
		while((linha = leitor.readLine())!=null) {
			System.out.println(linha);
		}
		leitor.close();
	}catch(IOException e) {
		System.err.println("Occoreu um erro na leitura do seu arquivo");
	}
}
}
