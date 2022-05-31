package practice2;

import java.util.ArrayList;

public class List {
	

	public static void main(String[] args) {
		ArrayList<Book> li=new ArrayList<Book>();
		Book  b1=new Book(101,"java",18);
		Book  b2=new Book(102,"c",19);
		Book  b3=new Book(103,"python",20);
		
		li.add(b1);
		li.add(b2);
		li.add(b3);
		
		for(Book b:li)
		{
			System.out.println(b.id+" "+b.name+" "+b.price);
		}
		

	}

}
