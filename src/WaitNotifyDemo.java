class Passenger extends Thread{
	int total=0;
	public void run(){
		synchronized (this) {
			System.out.println("Wait....");
			for(int i=0;i<1000;i++){
				total+=i;
			}
			System.out.println("Passenger is given notification call");
		
			notify();
			}
		
	}
}

public class WaitNotifyDemo {
	public static void main(String[] args)throws InterruptedException {
		Passenger p=new Passenger();
		p.start();
		synchronized (p) {
			System.out.println("Passenger is waiting for the bus");
			p.wait();
			System.out.println("Passenger got notification");
			
		}
		System.out.println("after "+p.total+" time");
	}
}
