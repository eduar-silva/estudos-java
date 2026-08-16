package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:00");
		Instant d03 = Instant.parse("2022-07-20T01:30:00Z");
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		
		System.out.println("R1 : " + r1);
		System.out.println("R2 : " + r2);
		System.out.println("R3 : " + r3);
		System.out.println("R4 : " + r4);
		
		System.out.println("d01 dia: " + d01.getDayOfMonth());
		System.out.println("d01 mês: " + d01.getMonthValue());
		System.out.println("d01 ano: " + d01.getYear());
		
		System.out.println("d02 hora: " + d02.getHour());
		System.out.println("d02 minuto: " + d02.getMinute());
		
	}

}
