package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum, 
			avg;
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		
		avg = sum/vect.length;
		
		System.out.print("ELEMENTOS DO VETOR: ");
		for(int i=0; i<vect.length; i++) {
			System.out.print(vect[i] +"  ");
		}
		
		System.out.printf("%nMÉDIA: %.2f | SOMA: %.2f", avg, sum);
		
		sc.close();
	}

}
