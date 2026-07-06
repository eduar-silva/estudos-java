//versão com menos flexibilidade em apenas um ponto, a busca por índice, se eu quisesse trabalhar com mais dados, ficaria mais difícil, pois não faço a busca por índice, apenas armazeno o nome do mais velho

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, maisVelho;
		String nomeMaisVelho = null;
		
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa%n", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			idade[i] = sc.nextInt();
		}
		
		maisVelho = idade[0];
		
		for(int i=1; i<n; i++) {
			if(idade[i] >= maisVelho) {
				maisVelho = idade[i];
				nomeMaisVelho = nome[i];
			}
		}
		
		System.out.println("Nome do mais velho: " + nomeMaisVelho);
		
		sc.close();
	}

}
