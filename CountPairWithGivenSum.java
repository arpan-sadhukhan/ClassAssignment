package Array;

import java.util.Scanner;

public class CountPairWithGivenSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter given sum");
		int givenSum=sc.nextInt();
		System.out.println(countPairWithGivenSum(arr, givenSum));			

	}
	static int countPairWithGivenSum(int arr[], int givenSum)
	{
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
				if(arr[i]+arr[j]==givenSum)
				{
					count++;
				}
			}
		}
		return count;
	}

}
