class Kedua {
	public static void Bermain(String[] args) {
		Pelajar myObj = new Pelajar();

		System.out.println("Name: " + myObj.fname);
		System.out.println("Age: " + myObj.age);
		System.out.println("Graduation Year: " + myObj.graduationYear);
		myObj.study();
	}
}
