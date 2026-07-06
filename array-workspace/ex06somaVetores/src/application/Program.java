package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Tamanho do vetor: ");
		n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectSoma = new int[n];
		
		System.out.println("Valores do VetorA: ");
		for(int i=0; i<n; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Valores do VetorB: ");
		for(int i=0; i<n; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			vectSoma[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("Vetor Resultante das Somas de A+B: ");
		for(int i=0; i<n; i++) {
			System.out.println(vectSoma[i]);
		}
		
		sc.close();
	}

}
