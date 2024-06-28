package week1.day2;

public class Palindrome

{

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub
		int num = 133; // Input number
		int min = num;
		int i;
		int rem;
		int rev = 0;

		for (i = 0; i < 3; i++) {
			rem = min % 10; // Remainder value
			rev = rev * 10 + rem; // Reversed value
			min = min / 10;
		}
		// Print
		System.out.println("The reverse number " + rev);

		if (rev == num) {
			System.out.println("The Number is Palindrome");
		} else {
			System.out.println("The Number is Not Palindrome");
		}
	}
}