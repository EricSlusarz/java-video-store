

import java.math.BigDecimal;

public class RentalCalculator {

	public BigDecimal calculate(Movie movie, int days) {
		BigDecimal amount;

		if (movie.getPriceCode().equals("regular")) {

			amount = new BigDecimal("2.00");
			if (days > 2) {
				BigDecimal extraDays = new BigDecimal(days - 2);
				amount = amount.add(new BigDecimal("1.5").multiply(extraDays));
			}
		} else if (movie.getPriceCode().equals("childrens")) {

			amount = new BigDecimal("1.50");
			if (days > 3) {
				BigDecimal extraDays = new BigDecimal(days - 3);
				amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
			}
		} else { // new release

			BigDecimal rentalDays = new BigDecimal(days);
			amount = new BigDecimal("3.00").multiply(rentalDays);

		}
		return amount;

	}
}