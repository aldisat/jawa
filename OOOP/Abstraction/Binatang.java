abstract class Binatang {
	public abstract void suaraBinatang();
	public void sleep() {
		System.out.println("Zzzz");
	}
}

class Pig extends Binatang {
	public void suaraBinatang() {
		System.out.println("wee wee wee");
	}
}

class Main {
	public static void main(String[] args) {
		Pig babiKu = new Pig();
		babiKu.suaraBinatang();
		babiKu.sleep();
	}
}
