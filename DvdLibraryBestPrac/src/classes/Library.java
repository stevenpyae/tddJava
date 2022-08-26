package classes;

import java.util.ArrayList;
import java.util.Collection;

public class Library {

	private ArrayList<Movie> catalogue = new ArrayList<>();



	public void donate(Movie movie) {
		// TODO Auto-generated method stub
		catalogue.add(movie);
		movie.addCopy();
		
	}

	public boolean contains(Movie movie) {
		return ((Collection<Movie>) catalogue).contains(movie);
	}

}
