package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double avgHeight=0.0, sum=0.0, perAge;
		
		int n = sc.nextInt();
		People[] vectP = new People[n];
		
		for(int i=0; i<vectP.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			vectP[i] = new People(nome, idade, altura);
		}
		
		//média de altura
		sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vectP[i].getAltura();
		}
		avgHeight = sum/n;
		
		//porcentagem menor de 16
		sum = 0.0;
		for(int i=0; i<n; i++) {
			if(vectP[i].getIdade() < 16) {
				sum++;
			}
		}
		perAge = sum/n * 100;
		
		//apresentação dos dados
		System.out.printf("Média de Altura: %.2f%n", avgHeight);
		System.out.println("Porcentagem menor de 16: "+perAge+"%");
		for(int i=0; i<n; i++) {
			if(vectP[i].getIdade() < 16) {
				System.out.println(vectP[i].getNome());
			}
		}
		
		sc.close();
	}

}