package practice2;

public class changecasestring {

	public static void main(String[] args) {
		String s1="kranthi123";
		String s2=" ";
		String s3=" ";
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c>='A'&&c<='Z')
			{
				s2+=(char)(c+32);
			}
			else if(c>='a'&&c<='z')
			{
				s2+=(char)(c-32);
			}
			else if(c>='0'&&c<='9')
			{
				s3+=c;
			}
			
		}
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
