package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posicaoMaior;
		double maiorValor;
		
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		posicaoMaior = 0;
		maiorValor = vect[0];
		
		for(int i=1; i<n; i++) {
			if(vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("Maior Valor: %.1f | Posicao do Maior Valor: %d", maiorValor, posicaoMaior);
		
		sc.close();
	}

}
