

import java.math.BigDecimal;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title, "Price Code 2");
	}

	public String getTitle() {
		return this.title;
	}

	public String getPriceCode() {
		return this.priceCode;
	}

	public BigDecimal calculateFees(int daysrented) {
		BigDecimal amount = new BigDecimal("2.00");
		if (daysrented > 2) {
			BigDecimal extraDays = new BigDecimal(daysrented - 2);
			amount = amount.add(new BigDecimal("1.5").multiply(extraDays));
		}
		return amount;
	}

}
