package oops;

public class Employee {

	public String Name;
	public int EmpId;
	private static int Salary = 10000;

	public Employee() {
		System.out.println("Inside default cons:");
	}

	public Employee(String var1, int var2) {
		System.out.println("Inside param cons");

		this.Name = var1;
		this.EmpId = var2;
	}

	public Employee(String var1) {
		System.out.println("Inside param cons");
		Name = var1;
	}

	public Employee(int var2) {
		System.out.println("Inside param cons");
		EmpId = var2;
	}

	public void DisplayName() {

		System.out.println("Name of the employee: " + Name);
	}
	
	public static void DisplaySalary() {
		System.out.println("Salary of all Emp: " + Salary);
	}
}