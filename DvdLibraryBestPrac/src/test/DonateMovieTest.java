package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import classes.Library;
import classes.Movie;

public class DonateMovieTest {
	
	private Library library;

	public DonateMovieTest() {
		library = new Library();
	}

	@Test
	public void donateMovie() {
		Movie movie = new Movie();
		library.donate(movie);
		
		assertTrue(library.contains(movie));
		//test should have one reason to fail
		assertEquals(1, movie.getCopies());
	}

}
