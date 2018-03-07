import java.util.*;
class SetDuplicate {
	public static void main(String[] args) {
		Set<String> name = new HashSet<String>();
		name.add("mukund");
		name.add("Mukund");
		name.add("muKund");
		name.add("mukunD");
		System.out.println("Names are");
		for(String i : name) {
			System.out.println(i);
		}
	}
}
