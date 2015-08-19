class TwoStrings{
	synchronized static void print(String s1,String s2){
		System.out.println(s1);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		System.out.println(s2);
	}
}
class PrintStringsThread implements Runnable{
	String s1,s2;
	Thread t;
	public PrintStringsThread(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		TwoStrings.print(s1, s2);
	}
}
public class SynchThread {
	public static void main(String[] args) {
		new PrintStringsThread("Hello","Hi");
		new PrintStringsThread("How","are you?");
		new PrintStringsThread("Thank","you");
	}
}
