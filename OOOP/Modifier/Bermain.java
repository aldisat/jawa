abstract class Bermain {
	public String fname = "John";
	public int age = 24;
	public abstract void study();
}

class Pelajar extends Bermain{
	public int graduationYear = 2018;
	public void study() {
		System.out.println("Belajar Semalaman");
	}
}
