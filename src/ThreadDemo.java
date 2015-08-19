class MyThread3 implements Runnable{
	/*public MyThread3()
	{
		Thread t=new Thread(this,"deep");
		System.out.println(t);
		t.start();
	}*/
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			try
			{
			Thread.sleep(100);
			System.out.println("MyThread "+i);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
}
 public class ThreadDemo
 {
	 public static void main(String[] args) {
		Thread t=new Thread(new MyThread3());
		System.out.println(Thread.currentThread());
		t.start();
	}
 }
