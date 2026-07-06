package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, maiorIdade, posicaoMaisVelho=0;
		
		n = sc.nextInt();
		
		Pessoa[] person = new Pessoa[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			person[i] = new Pessoa(idade, nome);
		}
		
		maiorIdade = person[0].getIdade();
		
		for(int i=1; i<n; i++) {
			if(person[i].getIdade() > maiorIdade) {
				maiorIdade = person[i].getIdade();
				posicaoMaisVelho = i;
			}
		}
		
		System.out.println("Mais Velho: " + person[posicaoMaisVelho].getNome());
		
		sc.close();
	}

}