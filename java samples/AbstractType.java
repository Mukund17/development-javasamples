interface Shapes {
	void draw();
	}
class Square implements Shapes {
	public void draw() {
		System.out.println("Square is a shape");
	}
}
class AbstractType {
	public static void main(String[] args) {
		Shapes s= new Square();
		s.draw();
	}
}
