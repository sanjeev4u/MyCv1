public class alpha 
{
	public static void main(String[] args) 
	{
		int a=65;
		for(int i=0;i<5;i++)
		{
			System.out.print((char) a);
			for(int j=0;j<i;j++)
			{
				System.out.print((char)++a);
			}
			System.out.println();
			a++;

		}
	}
}