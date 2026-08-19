package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		String localDate = sc.next();
		
		//tranformando em um localDate
		int day = Integer.parseInt(localDate.substring(0, 2));
		int month = Integer.parseInt(localDate.substring(3, 5));
		int year = Integer.parseInt(localDate.substring(6));
		LocalDate birthDay = LocalDate.of(year, month, day);
		
		//instancia cliente
		Client cliente = new Client(name, email, birthDay);
		
		sc.nextLine();
		System.out.println("Enter order data");
		System.out.print("Type 1 - Pending Payment | 2 - Processing | 3 - Shipped | 4 - Delivered\nStatus: ");
		int userOption = sc.nextInt();
		
		OrderStatus status = OrderStatus.PENDING_PAYMENT;
		switch(userOption) {
		case 1:
			status = OrderStatus.PENDING_PAYMENT;
			break;
		case 2:
			status = OrderStatus.PROCESSING;
			break;
		case 3:
			status = OrderStatus.SHIPPED;
			break;
		case 4:
			status = OrderStatus.DELIVERED;
			break;
		default:
			System.out.println("Inválido!");
		}
		Instant orderHour = Instant.now();
		Order pedido = new Order(orderHour, status, cliente);
		
		System.out.print("How many items to this order? ");
		int qntd = sc.nextInt();
		
		for(int i=0; i<qntd; i++) {
			sc.nextLine();
			System.out.println("Enter " + i + "# item data");
			System.out.print("Product Name: ");
			String productName = sc.nextLine();
			System.out.print("Product Price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int qntdProduct = sc.nextInt();
			
			Product product = new Product(productName, price);
			
			OrderItem item = new OrderItem(qntdProduct, price, product);
			pedido.addItem(item);
		}
		
		System.out.println();
		System.out.println("--Order Summary--");
		System.out.println("Order Moment: " + fmt1.format(orderHour));
		System.out.println("Order Status: " + pedido.getStatus());
		System.out.println("Client: " + cliente);
		System.out.print("Order Items: ");
		System.out.print(pedido);
		System.out.print("\nTotal price: $" + pedido.total());
		
		sc.close();
	}

}
