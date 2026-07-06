package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, soma, count;
		double media;
		
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		count=0;
		soma=0;
		for(int i=0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				soma += vect[i];
				count++;
			}
		}
		
		media=0;
		for(int i=0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				media = soma/count;
			} else {
				media = 0;
			}
		}
		
		if(media != 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		} 
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
