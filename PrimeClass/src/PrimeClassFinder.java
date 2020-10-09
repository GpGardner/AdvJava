import java.util.ArrayList;

/**
 * Main
 */
public class PrimeClassFinder {

	public boolean isPrime(int number) {
		if (number == 1 || number == 2) {
			return true;
		}

		if (number % 2 == 0) {
			return false;
		}

		for (int i = number - 1; i > 2; i--) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;

	}

	public ArrayList<Integer> checkPrimeClass(int startYear, int endYear) {
		ArrayList<Integer> primeYears = new ArrayList<Integer>();
		ArrayList<Integer> primeClasses = new ArrayList<>();

		int position;

		for (int i = startYear; i <= endYear; i++) {
			if (isPrime(i)) {
				primeYears.add(i);
				if (primeYears.contains(i - 4)) {
					primeClasses.add(i);
				}

			}
		}

		return primeClasses;

	}

	public static void main(String[] args) {
		PrimeClassFinder main = new PrimeClassFinder();

		System.out.println(main.isPrime(1997));
		System.out.println(main.isPrime(2003));
		System.out.println(main.isPrime(2087));

		System.out.println(main.checkPrimeClass(1900, 2100));
	}

}