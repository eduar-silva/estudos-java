package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados de aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/yyyy/mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt1);
		System.out.print("Retorno (dd/yyyy/mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt1);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		sc.close();
	}

}
