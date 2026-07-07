package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, quartoAlugar;
		String nomeAux, emailAux;
		
		Integer[] quartos = new Integer[10];
		String[] nomes = new String[10];
		String[] email = new String[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Aluguel #%d%n", i);
			nomeAux = sc.nextLine();
			emailAux = sc.nextLine();
			quartoAlugar = sc.nextInt();
			
			if(quartos[quartoAlugar] != null) {
				System.out.println("Quarto Ocupado!");
			} 
			else {
				nomes[quartoAlugar] = nomeAux;
				email[quartoAlugar] = emailAux;
				quartos[quartoAlugar] = quartoAlugar;
			}
		}
		
		for(int i=0; i<nomes.length; i++) {
			if(nomes[i] != null) {
				System.out.printf("%d: %s, %s%n", quartos[i], nomes[i], email[i]);
			}
		}
		
		sc.close();
	}

}
