package kran;
public class Vowels {

	public static void main(String[] args) {
		String s1="kranthi345";
		int count=0;
		int count1=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				System.out.println(c);
				count1++;
			}
			if(c>='1'&&c<='9')
			{
				
				System.out.println(c);
				count++;
			}
		}
		System.out.println("vowels:"+count1);
		System.out.println("numbers"+count);
		

	}

}
