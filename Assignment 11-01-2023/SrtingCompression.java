/*online written test have a coding question, wherein the students are given a string with multiple characters that are repeated consecutively. 
You’re supposed to reduce the size of this string using mathematical logic given as in the example below :

Input :

aabbbbeeeeffggg

Output:

a2b4e4f2g3

Input :

abbccccc

Output:

ab2c5
*/
package string;

import java.util.Scanner;

public class SrtingCompression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=sc.nextLine();
		int i,j;
//		String str=new String("");
		int count;
		
		for(i=0;i<s.length();i++)
		{
			count=0;
			for(j=i;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)) {
//					str=str+s.charAt(i);
					count++;
					i=j;
					}
				else {
					continue;}
				
			}
			System.out.print(s.charAt(i));
		if(count>1) {
				System.out.print(count);
		}
				
			
		}
		System.out.println();
//		System.out.println(str);
	}

}
