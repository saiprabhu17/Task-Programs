package CollectionF;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(3);
		al.add(5);
		al.add(3);
		LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
		lhs.addAll(al);
		System.out.println(lhs);

	}

}
