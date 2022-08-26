package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import classes.Library;
import classes.Movie;

public class DonateMovieTest {
	
	private Library library;
	private Movie movie;

	public DonateMovieTest() {
		library = new Library();
		movie = new Movie();
	}

	@Test
	public void movieAddedToCatalogue() {
		library.donate(movie);
		
		assertTrue(library.contains(movie));
		//test should have one reason to fail
		
	}
	@Test
	public void rentalCopyAdded() {
		library.donate(movie);
		assertEquals(1, movie.getCopies());
	}

}
