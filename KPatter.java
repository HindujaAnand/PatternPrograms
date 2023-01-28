package Pattern;

public class KPatter 
{
	public static void main(String[] args) 
	{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=3;j++)
		{
			if(j==1 || (i+j==4) || (i-j==2))
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
