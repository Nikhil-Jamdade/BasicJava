package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 4, 5 };

		System.out.println("Lenth: " + arr1.length);
		System.out.println("Third value: " + arr1[2]);
		System.out.println("Last ele: " + arr1[arr1.length - 1]);

		String[] arr2 = { "Nik", "Fik", "Jik", "Tik" };
		System.out.println("Second value: " + arr2[1]);

		String str = "Clean world happy green world";

		String[] str1 = str.split(" ");
		System.out.println("Total words: " + str1.length);

	}

}