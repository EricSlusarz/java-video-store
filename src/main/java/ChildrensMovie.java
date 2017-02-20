

import java.math.BigDecimal;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title) {
		super(title, "Price Code 1");
	}

	public String getTitle() {
		return this.title;
	}

	public String getPriceCode() {
		return this.priceCode;
	}

	public BigDecimal calculateFees(int daysrented) {

		BigDecimal amount = new BigDecimal("1.50");
		if (daysrented > 3) {
			BigDecimal extraDays = new BigDecimal(daysrented - 3);
			amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
		}
		return amount;
	}

}
