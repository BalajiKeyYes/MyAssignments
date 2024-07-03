package week1.assignments;

public class Fibonacci {

	public static void main(String[] args) {
	 
		int x = 10;
		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i < x; i++) {
			System.out.println("The Given number " + n1);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}
}