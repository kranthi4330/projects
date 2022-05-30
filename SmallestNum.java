package kran;

public class SmallestNum {

	public static void main(String[] args) {
		int[] a= {8,3,5,6,2,9,4};
		int index=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[index])  index=i; 
		}
		System.out.println("smallest ele=" +a[index]);
		System.out.println("index="+index);

	}

} 
