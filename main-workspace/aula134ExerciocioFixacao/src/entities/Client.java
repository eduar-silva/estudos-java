package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String name;
	private String email;
	private LocalDate birthday;
	
	public Client() {
	}

	public Client(String name, String email, LocalDate birthday) {
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getBirthday() {
		return birthday;
	}
	
	@Override
	public String toString() {
		return name + 
				" (" +  birthday.format(fmt) + ") - " +
				email;
	}
}
