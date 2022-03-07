package permanant;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Writing 
{
	public static void main(String[] args) throws IOException 
	{
//		File file=new File("E:\\Java\\kumar.txt");
//		FileOutputStream fos=new FileOutputStream(file);
//		
//		DataInputStream dis=new DataInputStream(System.in);
//		System.out.println("Tell us content to write:"+file.getName());
//		String content=dis.readLine();
//		fos.write(content.getBytes());
//		
//		System.out.println("Content has wriiten @ "+file.getAbsolutePath());
//		
//		dis.close();
//		fos.close();
		File fobj=new File("E:\\Java\\Umadevi.doc");
		FileWriter writing=new FileWriter(fobj);
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Tell us content to write:"+fobj.getName());
		String content=dis.readLine();
		
		writing.write(content);
		System.out.println("Content has written @ "+fobj.getAbsolutePath());

		
		writing.close();
		dis.close();
	}
}
