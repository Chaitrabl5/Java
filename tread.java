package P1;

	class myThread extends Thread
	{
		public void run()
		{
			for(int i=10;i<=15;i++)
			{
				
				System.out.println(i);
				System.out.println(Thread.currentThread().getName());
			}
		}}
	public class tread {
		public static void main(String args[]) throws InterruptedException
		{
			
			myThread obj=new myThread();
			obj.start();
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<=5;i++)
			{
				Thread.currentThread().sleep(2000);
				System.out.println(i);
				System.out.println(Thread.currentThread().getName());
			}
			
			
		}
	}


