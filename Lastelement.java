package Krant;

public class Lastelement {

	public static void main(String[] args) {
		String s1="java is an oop lang";
		String[] a=s1.split(" ");
		String s2=" ";
	   for(int i=a.length-1;i>=0;i--)
	   {
		   s2+=" "+a[i];
	   }
	   System.out.println(s2);
	    
	}

}
