package pattern;

public class InvertedPyramid 
{
 public static void main(String[] args) 
 {
for(int row=1;row<=3;row++)
{
	for(int space=1;space<row;space++)
	{
		System.out.print(" ");
	}
	 for(int n1=3;n1>=row;n1--)
	   {
	    System.out.print("*");
	   }
	 for(int n2=3;n2>row;n2--) 	
	   {
	   	System.out.print("*");
	   }
	   System.out.println();
 }
}
}
