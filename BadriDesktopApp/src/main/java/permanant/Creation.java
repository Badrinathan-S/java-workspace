package permanant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Creation 
{
	public static void main(String[] args) throws IOException 
	{
		//File obj=new File("E:\\Java\\kumar.txt");
		//obj.createNewFile();
		
		File fobj=new File("E:\\Java\\Umadevi.doc");
		FileOutputStream fos=new FileOutputStream(fobj);
		fos.close();
	}
}
