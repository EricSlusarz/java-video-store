

import java.util.Scanner;

public class VideoStoreApp {

	public static void main(String[] args) {

		Movie regular = new RegularMovie("WCCI");
		Movie childrens = new ChildrensMovie("Up");
		Movie newRelease = new NewRelease("Dr Strange");
		RentalStatement thePrintoutFromCollection = new RentalStatement();

		Scanner input = new Scanner(System.in);

		boolean quit = false;

		int theAmountOfDaysOfRent = 0;

		while (!quit) {

			System.out
					.println("What type of movie do you want \n1 for regular \n2 for Childrens \n3 for New Release ? ");
			String themovieyouchoose = input.next();
			System.out.println("How many days will you rent this item for?");
			theAmountOfDaysOfRent = input.nextInt();

			switch (themovieyouchoose) {
			case "1":
				Rental firstRentalRegular = new Rental(regular, theAmountOfDaysOfRent);
				thePrintoutFromCollection.add(firstRentalRegular);
				break;
			case "2":
				Rental secondRentalChildrens = new Rental(childrens, theAmountOfDaysOfRent);
				thePrintoutFromCollection.add(secondRentalChildrens);
				break;
			case "3":
				Rental thirdRentalNewRelease = new Rental(newRelease, theAmountOfDaysOfRent);
				thePrintoutFromCollection.add(thirdRentalNewRelease);
				break;
			default:
				System.out.println("Please choose 1-3");
				continue;
			}

			System.out.println("Do you want to ring up another movie(Y/N)?");
			String anotherMovieChoose = input.next().toUpperCase();
			if (anotherMovieChoose.equals("N")) {
				quit = true;
			}
			if (anotherMovieChoose.equals("Y")) {
			}

		}
		System.out.println("Thank you for choosing We Can Rent It!");

		thePrintoutFromCollection.printthisout();
		input.close();
	}

}