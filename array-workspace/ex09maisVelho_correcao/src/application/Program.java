package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, maiorIdade, posicaoMaisVelho=0;
		
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idade = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa%n", i+1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			idade[i] = sc.nextInt();
		}
		
		maiorIdade = idade[0];
		
		for(int i=1; i<n; i++) {
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaisVelho = i;
			}
		}
		
		System.out.println("Mais Velho: " + nomes[posicaoMaisVelho]);
		
		sc.close();
	}

}