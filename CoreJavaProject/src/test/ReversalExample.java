package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//******************************************************************//
		String str1 = "Hello World";

		String result = "";

		for (int i = str1.length() - 1; i >= 0; i--) {

			result = result + str1.charAt(i);
			// triangle first letter d to end result dlroW olleH
			// System.out.println("Reverse: " + result);
		}
		System.out.println("Reverse: " + result);
		System.out.println();
//******************************************************************//
		String str2 = "Madam";

		String result1 = "";

		for (int i = str2.length() - 1; i >= 0; i--) {

			result1 = result1 + str2.charAt(i);
			// triangle first letter d to end result dlroW olleH
			// System.out.println("Reverse: " + result);
		}
		System.out.println("Reverse: " + result1);

		// if(str2.equalsIgnoreCase(result1) {
		if (str2.equals(result1)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		System.out.println();
//******************************************************************//
		String str3 = "David meets John and Lily";

		String[] s1 = str3.split(" ");
		String result2 = "";

		for (int i = s1.length - 1; i >= 0; i--) {
			result2 = result2 + s1[i] + " ";
		}
		System.out.println("Result: " + result2.trim()); // trim to remove unnecessary spaces
		System.out.println();
//******************************************************************//
	}

}
