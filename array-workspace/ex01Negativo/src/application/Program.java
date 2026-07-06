package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n>10) {
			n = sc.nextInt();
		}
		
		int[] vect = new int[n];
		
		for(int i=0; i<vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
