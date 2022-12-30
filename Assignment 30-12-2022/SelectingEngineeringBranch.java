package Basic;

import java.util.Scanner;

public class SelectingEngineeringBranch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Computer Science & Engineering");
		System.out.println("2. Information Technology");
		System.out.println("3. Mechanical Engineering");
		System.out.println("4. Civil Engineering");
		System.out.println("Enter Your Preferance: ");
		int pref=sc.nextInt();
		menu(pref);		
			
		}
	
	public static void menu(int pref) {
		switch(pref) {
		case 1:
			subjects(1);
			confirmation();
			break;
		case 2:
			subjects(2);
			confirmation();
			break;
		case 3:
			subjects(3);
			confirmation();
			break;
		case 4:
			subjects(4);
			confirmation();
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
	public static void subjects(int pref) //method to show all the subjects under a chosen stream
	{
		switch(pref) {
		case 1:
			System.out.println("Your Subjects are :");
			System.out.println("1. CSE-Subject1");
			System.out.println("2. CSE-Subject2");
			System.out.println("3. CSE-Subject3");
			break;
		case 2:
			System.out.println("Your Subjects are :");
			System.out.println("1. IT-Subject1");
			System.out.println("2. IT-Subject2");
			System.out.println("3. IT-Subject3");
			break;
		case 3:
			System.out.println("Your Subjects are :");
			System.out.println("1. MECH-Subject1");
			System.out.println("2. MECH-Subject2");
			System.out.println("3. MECH-Subject3");
			break;
		case 4:
			System.out.println("Your Subjects are :");
			System.out.println("1. CVL-Subject1");
			System.out.println("2. CVL-Subject2");
			System.out.println("3. CVL-Subject3");
			break;
		default:
			System.out.println("Invalid Input");
		}
		
	}
	public static void confirmation() //method for confirmation from the student for their chosen stream
	{
		Scanner co=new Scanner(System.in);
		System.out.println("Are You Sure to Continue with this Stream?(Y/N)");
		char conf=co.next().charAt(0);
		if(conf=='N') 
			main(null);//if user do not confirm his stream it will return to the main method and the program will start from the beginning
		else
			System.out.println("Congratulations!");
		
		
	}

}
