package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*********************************************//
		for (int a = 1; a <= 10; a++) {
			System.out.print(a);
		}
		System.out.println("");
//*********************************************//
		for (int a = 10; a > 0; a--) {
			System.out.print(a);
		}
		System.out.println("");
//*********************************************//
		for (int a = 10; a > 0; a -= 2) {
			System.out.print(a);
		}
		System.out.println("");
//*********************************************//
		for (int a = 10; a > 0; a -= 3) {
			System.out.print(a);
		}
		System.out.println("");
//*********************************************//
		int[] arr1 = { 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Values: " + arr1[i]);
		}
		System.out.println("");
//*********************************************//
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int val : arr2) {
			System.out.print("Value: " + val);
		}
		System.out.println("");
//*********************************************//
		String str1 = "Nikhil is good";
		for (int i = 0; i < str1.length(); i++) {
			System.out.print("Char: " + str1.charAt(i));
		}
		System.out.println("");
		for (char value : str1.toCharArray()) {
			System.out.println(value);
		}
	}

}
