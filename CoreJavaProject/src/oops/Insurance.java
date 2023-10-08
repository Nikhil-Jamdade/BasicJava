package oops;

public class Insurance extends Citizen {

	public int InsuranceId;

	public Insurance() {

		super(); // it doesn't matter if you're typing this as the default cons of parent class will be called always
		// good practice to add this super
		System.out.println("inside default cons of Insurance");
	}

	public void Print() {

		super.Print();
		System.out.println("Insurance Id is " + InsuranceId);
	}

	public void Print(String message) {

		System.out.println("Typing some message " + message);
	}
}
