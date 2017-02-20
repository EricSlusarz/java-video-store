

import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {

	Collection<Rental> rentalarraylist = new ArrayList<Rental>();

	public void add(Rental toAdd) {
		rentalarraylist.add(toAdd);

	}

	public void printthisout() {

		for (Rental outputOfArrayList : rentalarraylist)
			System.out.println("\n" + outputOfArrayList.getPriceCode() + "\nThe title of your movie is: "
					+ outputOfArrayList.getTitle() + "\nFinal calcualted fee is: " + outputOfArrayList.calculateFees()
					+ "\nThe number of days rented: " + outputOfArrayList.getDays());
	}

}
