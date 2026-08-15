package application;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1UserInsert = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2Comparision = DateTimeFormatter.ofPattern("MM/yyyy");
		WorkerLevel lvl = WorkerLevel.JUNIOR;
		
		System.out.print("Enter department: ");
		String dep = sc.nextLine();
		Department department = new Department(dep);
		
		System.out.println("Enter Worker Data");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		
		System.out.print("(1-Junior; 2-MidLevel; 3-Senior)\nLevel: ");
		int escolhaLvl = sc.nextInt();
		if(escolhaLvl == 1) {
			lvl = WorkerLevel.JUNIOR;
		} 
		else if (escolhaLvl == 2) {
			lvl = WorkerLevel.MID_LEVEL;
		}
		else if (escolhaLvl == 3) {
			lvl = WorkerLevel.SENIOR;
		} 
		else {
			System.out.println("Número Inválido");
		}
		
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		sc.nextLine();
		
		Worker personWorker = new Worker(nome, lvl, baseSalary, department);
		
		System.out.print("How many contracts to this worker? ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			System.out.printf("%nEnter contract #%d data: %n", i);
			System.out.printf("Date (DD/MM/YYYY): ");
			sc.nextLine();
			LocalDate dataInsert = LocalDate.parse(sc.next(), fmt1UserInsert);
			System.out.print("Value per Hour: ");
			double perHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int horas = sc.nextInt();
			
			HourContract contract = new HourContract(dataInsert, perHour, horas);
			personWorker.addContract(contract);
		}
		
		sc.nextLine();
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		YearMonth dataYM = YearMonth.parse(sc.next(), fmt2Comparision);
		
		System.out.printf("Name: %s%nDepartment: %s%nIncome for %s: %.2f", personWorker.getName(), personWorker.getDepartment().getName(), fmt2Comparision.format(dataYM), personWorker.income(dataYM.getYear(), dataYM.getMonthValue()));
		
		sc.close();
	}

}
