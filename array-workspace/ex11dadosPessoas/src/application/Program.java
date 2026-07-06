package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, countMasc=0, countFem=0;
		double mediaAlturaFem, somaAltura=0, maiorAltura, menorAltura;
		
		n = sc.nextInt();
		
		double[] altura = new double[n];
		Character[] genero = new Character[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("dados da %da pessoa%n", i+1);
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			System.out.print("(M/F) Genero: ");
			genero[i] = sc.next().charAt(0);
		}
		
		for(int i=0; i<n; i++) {
			if(Character.toUpperCase(genero[i]) == 'F') {
				somaAltura += altura[i];
				countFem++;
			} else {
				countMasc++;
			}
		}
		
		mediaAlturaFem = somaAltura / countFem;
		
		maiorAltura = altura[0];
		menorAltura = altura[0];
		
		for(int i=1; i<n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			} else if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		System.out.printf("Menor Altura: %.2f%n", menorAltura);
		System.out.printf("Maior Altura: %.2f%n", maiorAltura);
		System.out.printf("Media de Altura das Mulheres: %.2f%n", mediaAlturaFem);
		System.out.println("Contagem de Homens: " + countMasc);
		
		sc.close();
	}

}
