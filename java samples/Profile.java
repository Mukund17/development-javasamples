abstract class Name {
	abstract void  refer();
}
class Identity extends Name {
	public void refer() {
		System.out.println("Name is mukund");
	}
}
class Profile {
	public static void main(String[] args) {
		Identity id=new Identity();
		id.refer();
	}
}
		
		