public class Pribadi {
	private String fname = "John";
	private String lname = "Doe";
	private String email = "john@doe";
	private int age = 24;

	public static void main(String[] args) {
		Pribadi myObj = new Pribadi();
		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Email: " + myObj.email);
		System.out.println("Age: " + myObj.age);
	}
}


