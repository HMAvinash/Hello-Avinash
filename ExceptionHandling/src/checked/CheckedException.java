package checked;
import java.io.*;
public class CheckedException 
{
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.println("file could not be found");
		}
	}

}
