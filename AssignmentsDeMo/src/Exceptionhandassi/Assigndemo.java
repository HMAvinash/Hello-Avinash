package Exceptionhandassi;

public class Assigndemo {

	public static void main(String[] args)  {
try{
	Thread.sleep(20);
}catch(InterruptedException e)
{
	throw new MyThreadException("Assignment exception needs to be handled");
}
	}

}
