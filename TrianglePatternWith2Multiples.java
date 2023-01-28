package pattern;

public class TrianglePatternWith2Multiples 
{
public static void main(String[] args) 
{
	int n=2;
	for(int row=1;row<=3;row++)
	{
		for(int col=1;col<=row;col++)
		{
			System.out.print(n +" ");
		}
		System.out.println();
		n=n+2;
	}
}
}
