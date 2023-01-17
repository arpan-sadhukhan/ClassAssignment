/*
 You are playing an online game. In the game, a list of N numbers is given. The player has to arrange the numbers so that all the odd numbers of the list come after the even numbers. Write an algorithm to arrange the given list such that all the odd numbers of the list come after the even numbers.

Input

The first line of the input consists of an integer numbers, representing the size of the list(N).
The second line of the input consists of N space-separated integers representing the values of the list
Output

Print N space-separated integers such that all the odd numbers of the list come after the even numbers

Example

Sample Input

8

10 98 3 33 12 22 21 11

Sample Output

10 98 12 22 3 33 21 11
*/

package Array;

import java.util.Scanner;

public class OddsAfterEvens {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("before arrangement: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("after arrangement: ");
		arrange(n, arr);
		

	}
	public static void arrange(int n,int arr[]) {
		int temp[]=new int[n];
		int i,index=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				temp[index]=arr[i];
				index++;
			}
			
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]%2!=0)
			{
				temp[index]=arr[j];
				index++;
			}
		}
		
		for(int x=0;x<n;x++)
		{
			System.out.println(temp[x]);
		}
	}


}
