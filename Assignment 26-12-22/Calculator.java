package Basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter 1st Operand: ");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd Operand: ");
		int num2=sc.nextInt();
		System.out.println("Enter the operator: ");
		char ch= sc.next().charAt(0);
		switch(ch)
		{
		case '+':
			add(num1,num2);
			break;
		case '-':
			sub(num1,num2);
			break;
		case '*':
			mul(num1,num2);
			break;
		case '/':
			div(num1,num2);
			break;
		default:
			System.out.println("Wrong Input");
			
		}
	}
	public static void add(int a, int b)
	{
		int c=a+b;
		System.out.println("The addition is : "+c);
	}
	public static void sub(int a, int b)
	{
		int c=a-b;
		System.out.println("The subtraction is : "+c);
	}
	public static void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("The multiplication is : "+c);
	}
	public static void div(int a, int b)
	{
		if(b==0)
			System.out.println("Invalid divisor");
		else {
		float c=(float)a/b;
		System.out.println("The quotient is : "+c);

		}
	}

}
