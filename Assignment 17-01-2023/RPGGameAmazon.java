/*Problem Statement:

While playing an RPG game, you were assigned to complete one of the hardest quests in this game. 
There are n monsters you’ll need to defeat in this quest. Each monster i is described with 
two integer numbers – poweri and bonusi. To defeat this monster, you’ll need at least poweri experience points. 
If you try fighting this monster without having enough experience points, you lose immediately. 
You will also gain bonusi experience points if you defeat this monster. You can defeat monsters in any order.

The quest turned out to be very hard – you try to defeat the monsters but keep losing repeatedly. 
Your friend told you that this quest is impossible to complete. Knowing that, you’re interested,
 what is the maximum possible number of monsters you can defeat?



(Question difficulty level: Hardest)

Input:

The first line contains an integer, n, denoting the number of monsters. The next line contains an integer, e, 
denoting your initial experience.Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer,
poweri, which represents power of the corresponding monster.Each line i of the n subsequent lines (where 0 ≤ i < n) 
contains an integer, bonusi, which represents bonus for defeating the corresponding monster.
Input	Output	Output Description
2
123
78
130
10
0	2	
Initial experience level is 123 points.
Defeat the first monster having power of 78 and bonus of 10. Experience level is now 123+10=133.
Defeat the second monster.
3
100
101
100
304
100
1
524	2	
Initial experience level is 100 points.
Defeat the second monster having power of 100 and bonus of 1. Experience level is now 100+1=101.
Defeat the first monster having power of 101 and bonus of 100. Experience level is now 101+100=201.
The third monster can’t be defeated.*/






package Array;

import java.util.Scanner;

public class RPGGameAmazon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int monsPow[]=new int[n];
		int bonus[]=new int[n];
		System.out.println("enter initial experience: ");
		int intExp=sc.nextInt();
		System.out.println("power of each monster: ");
		for(int i=0;i<n;i++)
		{
			monsPow[i]=sc.nextInt();
		}
		System.out.println("bonus of each: ");
		for(int i=0;i<n;i++)
		{
			bonus[i]=sc.nextInt();
		}
		System.out.println(fight(n, intExp, monsPow, bonus));

	}
	
	public static int fight(int n,int initialEx,int mPow[],int bonus[])
	{
		int i,count=0;
		do {
			int j=0;
		for(i=1;i<n;i++) {
			
			if(mPow[i]<=mPow[j]) 
				j=i;

								
		}
		if(mPow[j]<=initialEx)
		{
			count++;
			initialEx=initialEx+bonus[j];
			mPow[j]=Integer.MAX_VALUE;
		}
		else
		{
			break;
		}
		}while(true);
		return count;	
		
	}

}
