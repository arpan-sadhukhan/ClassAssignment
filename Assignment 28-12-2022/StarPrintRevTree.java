package Basic;

public class StarPrintRevTree {

	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(j>=i&&j<=6-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
