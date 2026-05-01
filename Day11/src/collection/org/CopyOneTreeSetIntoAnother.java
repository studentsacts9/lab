package collection.org;

import java.util.Iterator;
import java.util.TreeSet;

public class CopyOneTreeSetIntoAnother {

	public static void main(String[] args) {

		TreeSet<String> objSet = new TreeSet<>();
		objSet.add("Red");
		objSet.add("Yellow");
		objSet.add("Pink");
		objSet.add("White");
		objSet.add("Green");

		TreeSet<String> newObjSet = new TreeSet<>(objSet);

		Iterator<String> itr = newObjSet.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
