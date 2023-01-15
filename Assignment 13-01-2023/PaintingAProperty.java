/*We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
Note: Follow in input and output format as given in above example
*/
package Basic;

import java.util.Scanner;

public class PaintingAProperty {

	public static void main(String[] args) {
		int interCost=18,exterCost=12;
		int totalCost=0;
		double surface;
		double intSurfC=0,exSurfC=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Interior walls: ");
		int interWalls=sc.nextInt();
		System.out.println("Number of Exterior walls: ");
		int exterWalls=sc.nextInt();
		
		System.out.println("enter the surface area of interior walls: ");
		for(int i=0;i<interWalls;i++)
		{
			surface=sc.nextDouble();
			intSurfC=intSurfC+surface*interCost;
		}
		System.out.println("enter the surface area of exterior walls: ");
		for(int i=0;i<exterWalls;i++)
		{
			surface=sc.nextDouble();
			exSurfC=exSurfC+surface*exterCost;
		}
		
		System.out.println(intSurfC+exSurfC);		
		
	}

}
