/*You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input:
aA1_67
Output:
1

Sample Input:
a987 abC012
Output:
0*/
//Solution:-

package string;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a password: ");
		String pass=new String();
		pass=sc.nextLine();
		int n=pass.length();
		System.out.println(CheckPassword(pass, n));

	}
	
	public static int CheckPassword(String str,int n) {
		boolean flag=true;
		int count=0,cap=0;
		
			if(n<4) //to check password length at least 4
				flag=false;
				
			if(str.charAt(0)>='0'&&str.charAt(0)<='9') //to check 1st character is not an integer
				flag=false;				
			
			if(str.contains(" ")||str.contains("/"))//to check if it contains any space or slash
				flag=false;
			
		
		for(int i=0;i<n;i++) 
		{
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')//to check if it contains at least one integer
				count++;
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')//to check if it contains at least one upper case letter
				cap++;
			
		}
		if(flag==true &&count>=1&&cap>=1)
			return 1;
		else 
			return 0;
		
		
}
}
