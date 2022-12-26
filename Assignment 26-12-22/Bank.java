package Basic;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int accountBal=0;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press the Number");
		System.out.println("1 for Withdraw");
		System.out.println("2 for Deposit");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			
			System.out.println("Enter the ammount to be withdrawn: ");
			int w=sc.nextInt();
			if(w>accountBal)
				System.out.println("Insufficient Balance");
			else if(w<=accountBal)
			{
				accountBal=accountBal-w;
				System.out.println("Withdraw Successful");
				System.out.println("your Current account balance is: "+accountBal);
			}
			break;
		case 2:
			System.out.println("Enter the ammount to be deposit: ");
			int d=sc.nextInt();
			accountBal=accountBal+d;
			System.out.println("your Current account balance is: "+accountBal);
			break;
		}
		
	}while(true);
	}
	}
