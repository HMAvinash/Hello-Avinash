public class Multiplecatch {

	public static void main(String[] args) 
	{
try{
	
		String input=args[0];
System.out.println("Input is "+input);
int output=Integer.parseInt(input);
System.out.println("Output is "+output);

	}catch(ArrayIndexOutOfBoundsException exp)
{
		System.out.println("Input is required");
}catch(NumberFormatException exp)
{
	System.out.println("Enter the correct format");
}
System.out.println("More code is here");
	}
	

}
