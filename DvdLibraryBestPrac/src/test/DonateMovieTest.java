package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import classes.Library;
import classes.Movie;

public class DonateMovieTest {
	
	@Test
	public void donateMovie() {
		//Start by asking the question that we want to ask, then reference it. 
		//Point 1: Work backwards from the assertions
		Library library = new Library();
		Movie movie = new Movie();
		library.donate(movie);
		
		assertTrue(library.contains(movie));
		assertEquals(1, movie.getCopies());
	}

}
