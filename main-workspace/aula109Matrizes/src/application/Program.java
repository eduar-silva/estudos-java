package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int countNegative = 0;
		
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		System.out.println("Digite os números da matriz: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matriz[i][j] < 0) {
					countNegative++;
				}
			}
		}
		
		System.out.println("Diagonal Principal: ");
		for(int i=0; i<n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println("\nCONT Numeros Negativos: " + countNegative);
		
		sc.close();
	}

}
