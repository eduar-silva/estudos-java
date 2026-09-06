package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("\nTax payer #" + i + " data");
			System.out.print("Individual or Company (i/c)? ");
			String indOrComp = sc.next();
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Anual Income: ");
			Double rendaAnual = sc.nextDouble();
			if(indOrComp.equalsIgnoreCase("i")) {
				System.out.print("Health expenditures: ");
				Double despesaSaude = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, rendaAnual, despesaSaude));
			}
			else {
				System.out.print("Number of Employees: ");
				int numeroFuncionarios = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		
		double totalImposto = 0;
		System.out.println("\nTAXES PAID");
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.calculoImposto()));
			totalImposto += pessoa.calculoImposto();
		}
		
		System.out.print("\nTOTAL TAXES: $ " + totalImposto);
		
		sc.close();
	}

}
