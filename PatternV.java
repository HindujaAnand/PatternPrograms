package Pattern; 

public class PatternV 
{

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++) 
			{
				if(i==j||i==4&&j==6||i==3&&j==7||i==2&&j==8||i==1&&j==9) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
	System.out.println();
		}
	}
	} 
	

