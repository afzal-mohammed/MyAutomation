package JavaLearning;

public class NumberEvenOdd {

	static void display(int x) {

		if (x % 2 == 0) {

			System.out.println("Given number is even " + x);

		} else {

			System.out.println("Given number is odd " + x);
		}
	}

	public static void main(String[] args) {
		display(13);
	}
}
