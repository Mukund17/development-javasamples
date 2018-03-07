import java.util.*;
class SetCollections {
	public static void main(String[] args) {
		Set<Integer> id=new HashSet<Integer>();
		id.add(1);
		id.add(2);
		id.add(2);
		id.add(10);
		for(int i : id) {
				System.out.println(i);
		}
	}
}
