package Basic;

public class StarPrintTree {

	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(j>=(6/2)-i&&j<=(6/2)+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
