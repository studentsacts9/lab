package collection.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CopyArrayList {
	public static void main(String []args) {
		try {
			ArrayList<String> colors = new ArrayList<>();
			colors.add("red");
			colors.add("blue");
			colors.add("pink");
			colors.add("brown");
			colors.add("orange");

			ArrayList<String> colorsCopy = new ArrayList<>(Collections.nCopies(colors.size(), ""));
			
			Collections.copy(colorsCopy,colors);
			
			Iterator<String> iter = colorsCopy.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
