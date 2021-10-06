//class Main {
	//static void myMethod(String fname) {
		//System.out.println(fname + "Refsnes");
	//}

	//public static void main(String[] args) {
		//myMethod("Liam");
		//myMethod("Jenny");
		//myMethod("Anja");
	//}
//}

class Main {
	static void checkAge(int age) {
		if (age < 18) {
			System.out.println("Access denied - You are not old enough");
		}
		else {
			System.out.println("Access granted - You are old enough");
		}
	}
	public static void main(String[] args) {
		checkAge(20);
	}
}
