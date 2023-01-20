/*
Problem Statement :

Maria plays college basketball and wants to go pro. Each season she maintains a record of her play.
She tabulates the number of times she breaks her season record for most points and least points in a game.
Points scored in the first game establish her record for the season, and she begins counting from there.

For example, assume her scores for the season are represented in the array scores=[12, 24, 10, 24].
Scores are in the same order as the games played. She would tabulate her results as follows:

                                 Count
Game  Score  Minimum  Maximum   Min Max
 0      12     12       12       0   0
 1      24     12       24       0   1
 2      10     10       24       1   1
 3      24     10       24       1   1


Given the scores for a season,
 find and print the number of times Maria breaks her records for most and least points scored during the season.


Function Description

Complete the breakingRecords function in the editor below.
It must return an integer array containing the numbers of times she broke her records.
Index 0 is for breaking most points records, and index 1 is for breaking least points records.

breakingRecords has the following parameter(s):

scores: an array of integers


Input Format

The first line contains an integer n, the number of games.
The second line contains n space-separated integers describing the respective values of score0, score1, ....., score n-1.


Constraints
1 <= n <= `1000
0 <= scores[i] <= `10^8

Output Format

Print two space-seperated integers describing the respective numbers of times the best (highest)
score increased and the worst (lowest) score decreased.*/

package Array;

import java.util.Scanner;

public class MariaBasketball {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		int records[]=new int[n];	
		System.out.println("enter the value of records: ");
		for(int i=0;i<n;i++)
		{
			records[i]=sc.nextInt();
		}
		System.out.print(breakingRecords(n, records)[0]+" ");
		System.out.print(breakingRecords(n, records)[1]+" ");

	}
	
	public static int[] breakingRecords(int n, int arr[]) {
		
		int max=arr[0],min=arr[0];
		int maxCount=0;
		int minCount=0;
		int res[]=new int [2];
		for(int i=1;i<n;i++)
		{
			if(arr[i]<min)
			{

				min=arr[i];
				minCount++;
			}
			else if(arr[i]>max)
			{
				max=arr[i];
				maxCount++;
			}
			else
				continue;
		}
		
		res[0]=maxCount;
		res[1]=minCount;
		return res;		
	}
}

















