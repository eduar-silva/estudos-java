package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		soma=0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		media = soma/n;
		
		System.out.printf("MEDIA DO VETOR: %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i=0; i<n; i++) {
			if(vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}

}
