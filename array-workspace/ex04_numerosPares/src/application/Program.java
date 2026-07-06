package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, cont=0;
		
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números Pares: ");
		for(int i=0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				cont++;
			}
		}
		
		System.out.println("\nQuantidade de Números Pares: " + cont);
		
		sc.close();
	}

}
