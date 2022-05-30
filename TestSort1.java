package Arrays;

import java.util.*;

public class TestSort1 {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(105,"kranthi",21));
		al.add(new Student(106,"karthik",25));
		al.add(new Student(107,"mahesh",28));
		
		Collections.sort(al);
		for(Student st:al)
		
		System.out.println(st.rollno+" "+st.name+" "+st.age);
		

	}

}
