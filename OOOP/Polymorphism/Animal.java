class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("wee wee");
	}
}

class Dog extends Animal {
	public void animalSound()	{
		System.out.println("Woof woof");
	}
}

class Main {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();

		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}
