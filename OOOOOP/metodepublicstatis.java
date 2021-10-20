public class metodepublicstatis {
	// Static method
	static void myStaticMethod(){
		System.out.println("Static methods can called without creating objects");
	}

	// Public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating object");
	}
	
	// Main method
	public static void main(String[] args) {
		myStaticMethod(); // Call the static method

		metodepublicstatis myObj = new metodepublicstatis();
		myObj.myPublicMethod();
	}

}
