package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double avgHeight,
				perAge,
				sum;
		
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			nome[i] = sc.nextLine();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
		}
		
		//média de alturas
		sum = 0.0;
		for(int i=0; i<altura.length; i++) {
			sum += altura[i];
		}
		avgHeight = sum/altura.length;
		
		//porcentagem menor de 16
		sum = 0.0;
		for(int i=0; i<idade.length; i++) {
			if(idade[i] < 16) {
				sum++;
			}
		}
		perAge = (sum/idade.length) * 100;
		
		//prints de altura, idade, nomes menor de 16
		
		System.out.printf("Altura Média: %.2f%n", avgHeight);
		System.out.println("Pessoas menor de 16: " + perAge + "%");
		for(int i=0; i<n; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}