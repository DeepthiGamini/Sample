class Thread1 implements Runnable{
	int counter1;
	public void run()
	{
		for(counter1=5;counter1<20;counter1+=5){
			
			try{
				Thread.sleep(100);
				System.out.println("This isThread1. Counter1:"+counter1);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
}

class Thread2 implements Runnable{
	int counter2;
	public void run()
	{
		for(counter2=10;counter2<40;counter2+=10){
			
			try{
				Thread.sleep(100);
				System.out.println("This isThread2. Counter2:"+counter2);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
}

class Thread3 implements Runnable{
	int counter3;
	public void run()
	{
		for(counter3=100;counter3<400;counter3+=100){
			
			try{
				Thread.sleep(100);
				System.out.println("This isThread3. Counter3:"+counter3);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
}


public class MultiThreadDemo {
	public static void main(String[] args) {
		Thread t1=new Thread(new Thread1());
		Thread t2=new Thread(new Thread2());
		Thread t3=new Thread(new Thread3());
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
