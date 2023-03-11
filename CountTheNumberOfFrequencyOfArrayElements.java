package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CountTheNumberOfFrequencyOfArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		countTheNumberOfFrequencyOfArrayElements(arr);
		
	}
	static void countTheNumberOfFrequencyOfArrayElements(int arr[])
	{
		int i,j;
		Arrays.sort(arr);
		
		for(i=0;i<arr.length;i++)
		{
			int count=0;
			for(j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				else {
					i=j-1;
					break;
				}
			}
			if(j==arr.length) {
				i=j;
				
			}
			System.out.println("frequency of "+arr[j-1]+" is "+count);
		}
	}
	

}
