// Create a class
public class aksesmetodedenganobjek {
	
	// Create a fullthrottle() method
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}

	// Create a speed() method and add a parameter
	public void speed(int maxSpeed) {
		System.out.println("Max speed is: " + maxSpeed);
	}

	// Inside main, call the mothods on the myCar object
	public static void main(String[] args) {
		aksesmetodedenganobjek myCar = new aksesmetodedenganobjek(); // Create myCar object
		myCar.fullThrottle();	// Call the fullThrottle() method
		myCar.speed(200);	// Call the speed() method
	}
} 
