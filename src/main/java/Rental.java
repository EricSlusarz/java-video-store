

import java.math.BigDecimal;

public class Rental {

	private Movie title;
	private int numberofdays;

	public Rental(Movie movieRented, int days) {
		this.title = movieRented;
		this.numberofdays = days;

	}

	public String getTitle() {
		return title.getTitle();
	}

	public String getPriceCode() {
		return title.getPriceCode();
	}

	public int getDays() {
		return numberofdays;
	}

	public BigDecimal calculateFees() {
		return title.calculateFees(numberofdays);

	}

}
