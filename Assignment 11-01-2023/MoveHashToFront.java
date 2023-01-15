/*You have write a function that accepts, a string which length is “len”,
the string has some “#”, in it you have to move all the hashes to the front of the string and return the whole string back and print it.

char* moveHash(char str[],int n);

example :-

Sample Test Case

Input:

Move#Hash#to#Front

Output:

###MoveHashtoFront
*/

package string;

import java.util.Scanner;

public class MoveHashToFront {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		StringBuilder strb=new StringBuilder(s);
		int len=strb.length();
		moveHash(strb, len);
		

	}
	
	public static void moveHash(StringBuilder str, int n)
	{
		int i,j;
		char temp;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='#') {
				for(j=i;j>0;j--) {
					temp=str.charAt(j);
					str.setCharAt(j, str.charAt(j-1));
					str.setCharAt(j-1, temp);
					
				}
			}
		}		
		System.out.println(str);
	}

}
