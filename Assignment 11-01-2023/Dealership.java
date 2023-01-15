/*A function is there which tells how many dealerships there are and the total number of cars in each dealership.

Your job is to calculate how many tyres would be there in each dealership.

Input

3 

4 2

4 0

1 2

Output

20

16

8 

There are total 3 dealerships

dealerships1 contains 4 cars and 2 bikes

dealerships2 contains 4 cars and 0 bikes

dealerships3 contains 1 cars and 2 bikes

Total number of tyres in dealerships1  is (4 x 4) + (2 x 2) = 20
Total number of tyres in dealerships2 is (4 x 4) + (0 x 2) = 16
Total number of tyres in dealerships3 is (1 x 4) + (2 x 2) = 8

*/

package Basic;

import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total number of dealarship: ");
		int n=sc.nextInt();
		int [][]arr=new int [n][2];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter car and bike of dealer "+(i+1)+": ");
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			System.out.print("total number of tyres of dealer "+(i+1)+": ");
			int tyres=arr[i][0]*4+arr[i][1]*2;
			System.out.println(tyres);
			
			
		}

	}

}








