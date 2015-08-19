import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileContent {

	public static void main(String[] args) {

		InputStream source = null;
		OutputStream dest = null;

		try {
			source = new FileInputStream("C:/Users/admin/Desktop/deepthi/myfile1.txt");
			dest = new FileOutputStream("C:/Users/admin/Desktop/deepthi/myfile2.txt");

			byte[] buf = new byte[1024];
			int bytesRead;

			while ((bytesRead = source.read(buf)) > 0) {
				dest.write(buf, 0, bytesRead);
			}

		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {

				if (source!=null) {
					source.close();
				}
				
				if (dest!=null) {
					dest.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
