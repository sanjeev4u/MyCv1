public class scrc 
{
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
					if(i==0 && j==5)
							System.out.print("*");
					else
							System.out.print(" ");
		
					if(i==5 && j==0)
							System.out.print("*");
							else
							System.out.print(" ");
					if(i==5 && j==10)
							System.out.print("*");
							else
							System.out.print(" ");
					if(i==10 && j==5)
								System.out.print("*");
							else
							System.out.print(" ");
			}
			System.out.println();
		}
	}
}