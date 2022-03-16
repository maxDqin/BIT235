package week07;

class Dog extends Animal {
	public void move() {
		System.out.println("Dogs can walk and run");
	}

	public void bark() {
		System.out.println("Dogs can bark");
	}

	public static void main(String args[]) {
		Animal a = new Animal();
		// Animal reference and object
Dog b = new Dog();
		// Animal reference but Dog object

		a.move();
		// runs the method in Animal class
		b.move();
		// Runs the method in Dog class
		b.bark();
	}

}