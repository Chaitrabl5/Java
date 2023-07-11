package P1;

class myThread implements Runnable
{
	public void run()
	{
		for(int i=10;i<=15;i++)
		{
			
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
	}
public class tread2 {
	public static void main(String args[]) throws InterruptedException
	{
		myThread mt=new myThread();
		Thread t=new Thread(mt);
		t.start();		
		for(int i=0;i<=5;i++)
		{
			Thread.currentThread().sleep(2000);
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}
}


