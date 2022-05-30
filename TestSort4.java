package Arrays;

import java.util.*;

public class TestSort4 {

	public static void main(String[] args) {
		ArrayList<Student3> al=new ArrayList<Student3>();
		al.add(new Student3(105,"kranthi",21));
		al.add(new Student3(106,"gali",22));
		al.add(new Student3(107,"mahesh",23));
		
		System.out.println("sorting by name");
		Collections.sort(al, new NameComparator());
		for(Student3 st:al)
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		
		System.out.println("sorting by age");
		Collections.sort(al, new AgeComparator());
		for(Student3 st:al)
			System.out.println(st.rollno+" "+st.name+" "+st.age);

	}

}
