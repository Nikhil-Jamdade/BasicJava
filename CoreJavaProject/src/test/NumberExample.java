package test;

public class NumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;

//		int result = addition(num1 , num2);
		int result = subtraction(num2 , num1);
		System.out.println("Result is: " + result);

	}

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int subtraction(int a, int b) {
		return a - b;

	}
}
