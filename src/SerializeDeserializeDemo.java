import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name;
	Employee(){
		id=12;
		name="deepthi";
	}
}
public class SerializeDeserializeDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e=new Employee();
		FileOutputStream fout = null;
		ObjectOutputStream objout = null;
		try{
			fout=new FileOutputStream("C:/Users/admin/Desktop/deepthi/myfile.txt");
			objout=new ObjectOutputStream(fout);
			objout.writeObject(e);
		}
		catch(FileNotFoundException ffe)
		{
			System.out.println(ffe);
		} 
		catch (IOException io) {
			io.printStackTrace();
		}
		finally
		{
			if(fout!=null)
				fout.close();
			if(objout!=null)
				objout.close();
		}
		FileInputStream fin = null;
		ObjectInputStream objin = null;
		Employee e1 = null;
		try{
			fin=new FileInputStream("C:/Users/admin/Desktop/deepthi/myfile.txt");
			objin=new ObjectInputStream(fin);
			e1=(Employee)objin.readObject();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		finally{
			if(fin!=null)
				fin.close();
			if(objin!=null)
				objin.close();
	}
	System.out.println("Id:"+e1.id);
	System.out.println("Name:"+e1.name);
}
}

