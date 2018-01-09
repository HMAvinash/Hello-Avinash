package AssignmentThread;

public class DemoClass 
{
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Normal number is "+i);
			Thread.sleep(1000);
		}
		
	System.out.println("Normal number Execution is completed");
	DisplayNumber dm=new DisplayNumber();
	MYThread t1=new MYThread(dm,1,"Odd Numbers");
	MYThread t2=new MYThread(dm,2,"Even Numbers");

	
	t1.start();
	t1.join();
	t2.start();
	
	}
}
