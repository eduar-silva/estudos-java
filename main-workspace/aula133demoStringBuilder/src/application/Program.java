package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow, that's awesome!");
		
		LocalDateTime date1 = LocalDateTime.of(2018, 06, 21, 13, 05, 44);
		
		Post p1 = new Post(
				date1, 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good Night");
		Comment c4 = new Comment("May the force be with you!");
		
		LocalDateTime date2 = LocalDateTime.of(2018, 07, 21, 23, 14, 19);
		
		Post p2 = new Post(date2, "Good night guys", "See you tomorrow", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
