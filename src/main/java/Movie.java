

import java.math.BigDecimal;

public abstract class Movie {

	String title;
	String priceCode;

	public Movie(String title, String priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public abstract String getTitle();

	public abstract String getPriceCode();

	public abstract BigDecimal calculateFees(int daysrented);
}