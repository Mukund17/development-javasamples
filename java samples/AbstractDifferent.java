interface Shapes {
	void construct();
}
abstract class Circle implements Shapes {
	public void construct() {
		System.out.println("Circle is a shape");
	}
}
class Square extends Circle {
	public void draw() {
		System.out.println("Square is a shape");
	}
}
class AbstractDifferent {
	public static void main(String[] args) {
		Shapes s = new Square();
		s.construct();
	}
}
