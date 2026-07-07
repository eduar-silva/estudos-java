package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, quartoAlugado;
		
		String[] nome = new String[10];
		String[] email = new String[10];
		
		System.out.print("Quantidade de pessoas alugando: ");
		n = sc.nextInt();
		
		System.out.println();
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Aluguel #%d%n", i);
			System.out.print("Nome: ");
			String nomeAux = sc.nextLine();
			System.out.print("Email: ");
			String emailAux = sc.next();
			System.out.print("Quarto: ");
			quartoAlugado = sc.nextInt();
			
			nome[quartoAlugado] = nomeAux;
			email[quartoAlugado] = emailAux;
		}
		
		for(int i=0; i<nome.length; i++) {
			if(nome[i] != null) {
				System.out.println(i + ": "+ nome[i] + ", " + email[i]);
			}
		}
		
		sc.close();
	}

}
