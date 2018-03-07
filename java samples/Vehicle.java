abstract class Bike {
	abstract void getPrice();
}
class Yamaha extends Bike {
	public void getPrice() {
		System.out.println("Price is 95000");
	}
}
class Honda extends Bike {
	public void getPrice() {
		System.out.println("Price is 80000");
	}
}
class Vehicle {
	public static void main(String[] args) {
		Bike b = new Honda();
		b.getPrice();
	}
}
