package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		//solucao moderna de acordo com gemini
		File file = new File("C:\\in.txt");
		
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		/*
=======
>>>>>>> f50eef4b6a689d9e1887f5655527e55a57ab6b6e
		File file = new File("C:\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();				
			}
		}
		*/
	}
}
