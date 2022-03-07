package permanant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class WritingSecure 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("E:\\Java\\zealous.zip");
		FileOutputStream fos=new FileOutputStream(file);
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		
		String alpha="Manoj,Victor,Royappan,Dev";
		Double check=90.3;Boolean batch=false;
		StringBuilder sb=new StringBuilder();
		sb.append(alpha);sb.append(check);sb.append(batch);
		
		dos.write(sb.toString().getBytes());
		
		dos.close();
		fos.close();
	}
}
