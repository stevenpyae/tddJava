package classes;

import java.util.ArrayList;
import java.util.Collection;

public class Library {

	private ArrayList<Movie> catalogue = new ArrayList<>();

	public Collection<Movie> getCatalogue() {
		// TODO Auto-generated method stub
		return catalogue;
	}

	public void donate(Movie movie) {
		// TODO Auto-generated method stub
		catalogue.add(movie);
		movie.addCopy();
		
	}

	public boolean contains(Movie movie) {
		return getCatalogue().contains(movie);
	}

}
