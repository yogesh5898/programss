package procrateredAssesment.com.tcs;
import java.util.*;
public class MovieSolution {
	public static void main(String[] args) {
		Movie movie[] = new Movie[4];
		String search;
		
	Scanner sc = new Scanner(System.in);
		
	for(int i=0; i<movie.length; i++) {
		String movieName = sc.nextLine();
		String producingCompany =sc.nextLine();
		String genere = sc.nextLine();
		int budjet = sc.nextInt(); sc.nextLine();
		
	movie[i] = new Movie(movieName, producingCompany, genere, budjet); 
	}
		search = sc.nextLine();
		sc.close();
		
		Movie newMovie[] = budjetForGivenMovie(movie, search); 
		
		for(int i=0; i<newMovie.length; i++) {
			if(newMovie[i].getBudjet()>80000000) {
				System.out.println("High Budjet Movie "+newMovie[i].getBudjet());
			}
			else {
				System.out.println("Low Budjet Movie");
			}
		}	
	}
	
	private static Movie[] budjetForGivenMovie(Movie t[], String genere) {
		int c=0; 
		for(int i=0; i<t.length; i++) {
			if(t[i].getGenere().equals(genere)) {
				c++;
			}
		}
		int b=0;
		Movie m[] = new Movie[c];
		for(int i=0; i<t.length; i++) {
			if(t[i].getGenere().equals(genere)) {
				m[b] = t[i];
				b++;
			}
		}
		return m;

	}

}
