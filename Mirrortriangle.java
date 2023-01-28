package pattern;

public class Mirrortriangle
{
public static void main(String[] args)
{
	for(int row=1;row<=4;row++)
	{
		for(int colA=3;colA>=row;colA--)
		{
			System.out.print(" ");
		}
		for(int colB=1;colB<=row;colB++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
