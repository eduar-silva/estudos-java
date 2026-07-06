package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media;
		
		n = sc.nextInt();
		
		Alunos[] aluno = new Alunos[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			aluno[i] = new Alunos(nome, nota1, nota2);
		}
		
		for(int i=0; i<n; i++) {
			media = (aluno[i].getNota1() + aluno[i].getNota2()) / 2;
			if(media >= 6) {
				System.out.println(aluno[i].getNome());
			}
		} 
		
		sc.close();
	}

}