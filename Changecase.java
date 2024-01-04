package Kra2;

public class Changecase {

	public static void main(String[] args) {
			String s1="javaA1@";
			String s2=" ";
			for( int i=0;i<s1.length();i++)
			{
				char c=s1.charAt(i);
				if(c>='A'&&c<='Z')
					s2+=(char)(c+32);
				else if(c>='a'&&c<='z')
					s2+=(char)(c-32);
				else
					s2+=c;
					
			}
			System.out.println(s2);

	}

}
