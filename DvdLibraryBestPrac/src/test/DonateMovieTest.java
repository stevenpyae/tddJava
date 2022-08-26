package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import classes.Library;
import classes.Movie;

public class DonateMovieTest {
	
	@Test
	public void donateMovie() {
		//Start by asking the question that we want to ask
		Library library = new Library();
		Movie movie = new Movie();
		library.donate(movie);
		
		assertTrue(library.getCatalogue().contains(movie));
	}

}
