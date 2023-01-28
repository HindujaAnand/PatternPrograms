package pattern;

public class InvertedMirrorTriangle 
{
public static void main(String[] args) 
{	

for(int row=1;row<=4;row++)
{
	for(int colAt=1;colAt<row;colAt++)
	{
		System.out.print("-");
	}
	for(int colAh=4;colAh>=row;colAh--)
	{
		System.out.print("#");
	}
	System.out.println();
}
}
}
