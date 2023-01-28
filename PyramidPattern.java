package pattern;

public class PyramidPattern 
{
public static void main(String[] args) 
{
    for(int row=1;row<=3;row++)
    {
    	for(int colA=2;colA>=row;colA--)
    	{
    		System.out.print(" ");
    	}
    	for(int colB=1;colB<=row;colB++)
    	{
    		System.out.print("*");
    	}
    	for(int colC=1;colC<row;colC++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
 }
}

