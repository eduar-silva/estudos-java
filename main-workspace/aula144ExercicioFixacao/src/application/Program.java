package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		DateTimeFormatter dayMonthYear = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i): ");
			String productType = sc.next();
			System.out.print("Name: ");
			String productName = sc.next();
			System.out.print("Price: ");
			Double productPrice = sc.nextDouble();
			
			if(productType.equalsIgnoreCase("c")) {
				Product p = new Product(productName, productPrice);
				products.add(p);
			}
			else if (productType.equalsIgnoreCase("u")) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate productManufacturedate = LocalDate.parse(sc.next(), dayMonthYear);
				Product p = new UsedProduct(productName, productPrice, productManufacturedate);
				products.add(p);
			}
			else {
				System.out.print("Customs fee: ");
				Double productCustomFee = sc.nextDouble();
				Product p = new ImportedProduct(productName, productPrice, productCustomFee);
				products.add(p);
			}
		}
		
		System.out.println("\nPRICE TAGS: ");
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}