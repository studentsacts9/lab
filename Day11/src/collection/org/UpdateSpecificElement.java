package collection.org;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateSpecificElement {
	public static void main(String []args) {
		Scanner sc = null;
		try {
		ArrayList<String> colors=new ArrayList<>();
		sc=new Scanner(System.in);
		colors.add("red");
		colors.add("blue");
		colors.add("Pink");
		colors.add("brown");
		colors.add("orange");
		colors.add("dsygfdh");



		
		System.out.println("Enter the positon to update the element");
		int index=sc.nextInt();
		if(index>colors.size()) {
			System.out.println("Invalid index");
			return;
		}
		System.out.println("Enter the value to add");
		String value=sc.next();
		colors.set(index,value);
	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}
}
