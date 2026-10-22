package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\exercicio";
		
		File file = new File(path + "\\SelledItems.csv");
		
		try (Scanner sc = new Scanner(file)) {
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				String[] parts = str.split(",");
				
				String name = parts[0];
				double price = Double.parseDouble(parts[1]);
				int quantity = Integer.parseInt(parts[2]);
				Product product = new Product(name, price, quantity);
				
				boolean summary = new File(path + "\\out").mkdir();
				if (summary) {
					System.out.println("diretorio criado");
				}
				String summaryPath = path + "\\out\\summary.csv";
				double total = product.getPrice() * product.getQuantity();

				try (BufferedWriter bf = new BufferedWriter(new FileWriter(summaryPath, true))) {
					bf.write(product.getName() + "," + total);
					bf.newLine();
				}
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
