package Implementation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class persist 
{
	public static void main(String[] args) throws IOException {
		Employee e1=new Employee(1, "Avinash");
		FileOutputStream fout=new FileOutputStream("f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(e1);
		out.flush();
		System.out.println("success");
	}

}
