package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxRange = 10;
		for (maxRange = 10; maxRange >= 1; maxRange--) {
			if (maxRange % 2 == 1) {
				System.out.println("The number " + maxRange + " odd");

			}

		}
	}
}