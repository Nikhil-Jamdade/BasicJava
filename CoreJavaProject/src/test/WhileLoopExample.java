package test;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//********************************************//		
		int num1 = 1;

		while (num1 < 11) {
			System.out.print(num1);
			num1 = num1 + 1;
			// num1++
		}
		System.out.println("End of while loop");
//*********************************************//		
		int num2 = 10;

		while (num2 > 0) {
			System.out.print(num2);
			num2 = num2 - 1;
			// num2--
		}
		System.out.println("End of while loop");
//*********************************************//
		int num3 = 1;
		while (num3 < 11) {

			if (num3 == 5) {
				System.out.print("Skip");
				num3++;
				continue;
			}
			System.out.print(num3);
			num3++;
		}
		System.out.println();
//*********************************************//
	}

}