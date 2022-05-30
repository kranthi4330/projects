package kran;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] a= {4,6,8,1,3,7};
		int smallest=a[0];
		int smallest2=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				 smallest2=smallest;
				 smallest=a[i];
			}
			else if(a[i]<smallest2)
			{
				smallest2=a[i];
			}
		}
		System.out.println("SecondSmallest="+smallest2);

	}

}
