

import java.math.BigDecimal;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title, "Price Code 3");
	}

	public String getTitle() {
		return this.title;
	}

	public String getPriceCode() {
		return this.priceCode;
	}

	public BigDecimal calculateFees(int daysrented) {
		BigDecimal rentalDays = new BigDecimal(daysrented);
		BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);
		return amount;
	}
}
