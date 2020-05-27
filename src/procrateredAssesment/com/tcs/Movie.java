package procrateredAssesment.com.tcs;

public class Movie {
		private String movieName;
		private String producingCompany;
		private String genere;
		private int budjet;
		
public Movie(String movieName, String producingCompany, String genere, int budjet) {
		super();
		this.movieName = movieName;
		this.producingCompany = producingCompany;
		this.genere = genere;
		this.budjet = budjet;
		}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public String getProducingCompany() {
	return producingCompany;
}

public void setProducingCompany(String producingCompany) {
	this.producingCompany = producingCompany;
}

public String getGenere() {
	return genere;
}

public void setGenere(String genere) {
	this.genere = genere;
}

public int getBudjet() {
	return budjet;
}

public void setBudjet(int budjet) {
	this.budjet = budjet;
}

		
	
	
}
