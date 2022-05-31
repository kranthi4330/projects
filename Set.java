package practice2;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Set {

	public static void main(String[] args) {
		LinkedHashSet<String> al=new LinkedHashSet<String>();
		al.add("vijay");
		al.add("ravi");
		al.add("kranthi");
		al.add("mahesh");
		System.out.println(al);
		al.remove("ravi");
		System.out.println(al);
		
		
	}


}
