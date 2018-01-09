package AssignmentThread;

public class MYThread  extends Thread
{
	DisplayNumber dm;
	int num;
	String types;
	MYThread(DisplayNumber dm)
	{
		this.dm=dm;
	}
	MYThread(DisplayNumber dm,int num,String types)
	{
		this.dm=dm;
		this.num=num;
		this.types=types;
	}
	public void run()
	{
		
		try {
			dm.Display(num,types);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
