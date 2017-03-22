package refactoring.price;

import refactoring.dto.Movie;

public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return NEW_RELEASE;
	}
	
	@Override
	public double getCharge(int daysRented) {
		double result = 0;
		result = daysRented * 3000;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int aDaysRented) {
		return aDaysRented>1?2:1;
	}
	
}
