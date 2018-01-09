package AssignmentThread;

public class DisplayNumber 
{
	
		public void Display(int num,String types) throws InterruptedException
		{
			for(int i=num;i<=10;i+=2)
			{
				System.out.println(types+i);
				Thread.sleep(1000);
			}
			System.out.println(types+" is done");
				
	}

}
