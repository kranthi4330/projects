package practice2;

public class countduplicatescharacters {

	public static void main(String[] args) {
		String s1="java";
		String s2="";
		while(s1.length()>0)
		{
			char c=s1.charAt(0);
			s2=s1.replace(c+"","");
			int count=s1.length()-s2.length();
			s1=s2;
			
			if(count==1)
			{
				System.out.println(c);
			}
					
			
		}

	}

}
