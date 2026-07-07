package application;

import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		Aluguel[] rent = new Aluguel[10];
		
		System.out.println("Quantas pessoas irão alugar? ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Aluguel #%d%n", i);
			System.out.print("Nome: ");
			String nomeAux = sc.nextLine();
			System.out.print("Email: ");
			String emailAux = sc.next();
			System.out.print("Quarto a ser alugado: ");
			int quartoAlugar = sc.nextInt();
			
			rent[quartoAlugar] = new Aluguel(nomeAux, emailAux);
		}
		
		for(int i=0; i<rent.length; i++) {
			if(rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		
		sc.close();
	}

}
