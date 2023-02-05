package movie;
import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] arg) {
		Scanner keyboard = new Scanner(System.in);
		String answer;
		do {
			Movie movie1 = new Movie();
			System.out.println("Enter the name of a movie");
			String title = keyboard.nextLine();
			movie1.setTitle(title);
			System.out.println("Enter the rating of the movie");
			String rating = keyboard.nextLine();
			movie1.setRating(rating);
			System.out.println("Enter the number of tickets sold for this movie");
			int soldTickets = keyboard.nextInt();
			movie1.setSoldTickets(soldTickets);
			System.out.println(movie1.toString());
			System.out.println("Do you want to enter another? (y or n)");
			keyboard.nextLine();
			answer = keyboard.nextLine();
		} while (answer.equals("y"));
		System.out.println("Goodbye");
	}
}
