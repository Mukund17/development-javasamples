class Animal {
	public void walk(){
		System.out.println("Animals walk");
	}
	public void eat(){
		System.out.println("Animals eat");
	}
}
class Dog extends Animal {
	public void type() {
		System.out.println("Labrador");
	}
}

public class AnimalDog {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.walk();
		a.eat();
	    a.type();
	}
}

