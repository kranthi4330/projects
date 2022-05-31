package practice2;

public class countvowels {

	public static void main(String[] args) {
		String s1="kranthi123";
		int count=0;
		int count1=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
			if(c>='0'&&c<='9')
			{
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);

	}

}
