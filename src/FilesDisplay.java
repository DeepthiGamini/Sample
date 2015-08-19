import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadFile1 implements Runnable {
	String file1;
	public ReadFile1(String file1)
	{
		this.file1=file1;
	}

	public void run() {

		FileInputStream f1 = null;
		BufferedReader br;
		try {
			f1 = new FileInputStream(file1);
			br=new BufferedReader(new InputStreamReader(f1));
			String bytesRead;

			while ((bytesRead = br.readLine() ) != null) {
				System.out.println(bytesRead);
				Thread.sleep(100);
			}

		} 
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {

				if (f1!=null) 
					f1.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	

public class FilesDisplay {
	public static void main(String[] args) {
		Thread t1=new Thread(new ReadFile1(args[0]));
		Thread t2=new Thread(new ReadFile1(args[1]));
		t1.start();
		t2.start();
	}
}
