package JavaLearning;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 123;
		int rev;

		while (num > 0) {
			rev = num % 10;
			System.out.print(rev);
			num = num / 10;

		}
	}

}
 // test