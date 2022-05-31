package Krant;

import java.util.Arrays;

public class Duplicatearray {

	public static void main(String[] args) {
		int[] a= {3,2,6,7,5,2,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
			System.out.println(a[i]);
			}
		}
		
		
		
		}


}
