//Código errado, código dá erro lógico ao comparar números negativos. Fora a dificuldade para entender e ler o código.

package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, posicao=0;
		double maiorValor=0;
		
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n-1; i++) {
			if(vect[i+1] > vect[i]) {
				maiorValor = vect[i+1];
				posicao = i+1;
			}
		}
		
		System.out.println("Maior Valor: " + maiorValor);
		System.out.println("Posicao do maior valor: " + posicao);
		
		sc.close();
	}

}
