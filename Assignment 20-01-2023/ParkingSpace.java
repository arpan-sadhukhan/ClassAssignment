/*A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.

Example 1:
Input :
3   -> Value of R(row)
3    -> value of C(column)
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
Output :
3  -> Row 3 has maximum number of 1’s

Example 2:
input :
4 -> Value of R(row)
3 -> Value of C(column)
[0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]
Output :
4  -> Row 4 has maximum number of 1’s
*/

//Solution:

package Array;

import java.util.Scanner;

public class ParkingSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=3;
		int c=3;
		int arr[][]=new int[r][c];//array to store elements of each row and col
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(maxSpace(r, c, arr));
			
		
	}
	
	public static int maxSpace(int r,int c, int arr[][])
	{
		int index=0;
		int res[]=new int[r];
    //loop to check that how many number of free parking space in a row
		for(int i=0;i<r;i++)
		{
			int count=0;
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]==1)
					count++;
				if(j==c-1)
					res[index++]=count;
			}		
			
		}		
    //loop to find maximum number of free space among all rows
		int max=res[0];
		int ind=0;
		int p;
		for(p=0;p<index;p++)
		{
			if(max<res[p]) {
				max=res[p];
				ind=p;
				}
		}
//		for(int i1=0;i1<index;i1++)
//		{
//			System.out.print(res[i1]+" ");
//		}
		
		
		return ind+1;	
	}

}
