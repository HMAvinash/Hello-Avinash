import java.util.Scanner;

public class Division 
{
	public static void main(String[] args) {
		System.out.println("Enter the 2 integer");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		try
		{	
		int Res=a/b;
		System.out.println("result is "+Res);
	}
		catch(ArithmeticException e)
		{
			System.out.println("number cannot be divide by 0");
		}
		finally{
			System.out.println("in the final block");
		}
		System.out.println("More code can go here");
	}

}
