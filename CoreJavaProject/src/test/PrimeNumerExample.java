package test;

public class PrimeNumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 51;
		boolean flag = true;

		for (int i = 2; i <= a / 2; i++) {

			int rem = a % i;
			if (rem == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime number");
		}

	}

}