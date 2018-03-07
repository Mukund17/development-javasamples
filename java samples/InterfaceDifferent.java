interface message {
	void text();
	default void multimediate() {
		System.out.println("images and videos");
	}
}
class Information implements message {
	public void text() {
		System.out.println("Short Message Service");
	}
}
class InterfaceDifferent {
	public static void main(String[] args) {
		Information i = new Information();
		i.text();
		i.multimediate();
	}
}

		