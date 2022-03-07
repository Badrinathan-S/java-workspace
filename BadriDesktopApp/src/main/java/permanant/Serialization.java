package permanant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization 
{
	public static void main(String[] args) throws IOException 
	{
		Projector pro1=new Projector("EP-S41","Epson",29888);
		File file=new File("E:\\Java\\badri.doc");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(pro1);
		
		oos.close();
		fos.close();
	}
}
