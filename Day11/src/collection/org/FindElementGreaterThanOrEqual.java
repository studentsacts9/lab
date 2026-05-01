package collection.org;

import java.util.Scanner;
import java.util.TreeSet;

public class FindElementGreaterThanOrEqual {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			TreeSet<Float> objSet = new TreeSet<>();
			objSet.add(10.2F);
			objSet.add(20.52F);
			objSet.add(1F);
			objSet.add(-1.3F);
			objSet.add(10.25F);

			System.out.println("Enter a number :");
			Float value = sc.nextFloat();
			System.out.println(objSet.ceiling(value));

		} catch (Exception e) {
			e.getMessage();
		}

	}

}
