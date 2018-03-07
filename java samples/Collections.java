import java.util.*;
class Collections {
	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mukund");
		names.add("mukund");
		names.add("Adhi");
		System.out.println("The names are");
		names.remove("mukund");
		ListIterator<String> itr=names.listIterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}
}
