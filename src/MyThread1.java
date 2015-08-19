
class MyThread extends Thread{
	public MyThread()
	{
		Thread t=new Thread(this,"deep");
		System.out.println(t);
		t.start();
	}
	public void run()
	{
		
		for(int i=1;i<=10;i++)
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
 public class MyThread1
 {
	 public static void main(String[] args) {
		new MyThread();
		System.out.println(Thread.currentThread());
		//t.start();
	}
 }