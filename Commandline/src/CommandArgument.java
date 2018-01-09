
public class CommandArgument 
{
public static void main(String[] args) {
	int length=args.length;
	if(length==0)
	{
	System.out.println("No input provided");
	}
	else
	{
System.out.println("the arguments are:-");
for(int i=0;i<length;i++)
	System.out.println(args[i]);
	}
}
}
