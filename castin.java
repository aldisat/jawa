// widening casting
class Main {
	public static void main(String[] args) {
		int myInt = 9;
		float myDouble = myInt; // Automati casting: int to double
		
		System.out.println(myInt);
		System.out.println(myDouble);
	}
}

// narrowing casting
class Main2 {
	public static void main(String[] args) {
		double myDouble = 9.78d;
		int myInt = (int) myDouble; // Explicit casting: double tot int

		System.out.println(myDouble);
		System.out.println(myInt);
	}
}
