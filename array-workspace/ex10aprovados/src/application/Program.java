package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media;
		
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] notas1sem = new double[n];
		double[] notas2sem = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("dados do %da aluno%n", i+1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			notas1sem[i] = sc.nextDouble();
			notas2sem[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i=0; i<n; i++) {
			media = (notas1sem[i] + notas2sem[i]) / 2;
			if(media >= 6) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
