import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.util.concurrent.TimeUnit;
import java.nio.charset.Charset;
import java.util.*;

class Test{
	private static Path file;
	public static void main (String [] args)throws IOException {
		file = Paths.get("C:\\1\\2\\myFile.txt");
		
		//new Test().wrtieBytesToFileTheSimplest();
		//new Test().writeListToFileBetterMethod();
		
	}
	
	
	// ********** WRITING **********
	
	public void wrtieBytesToFileTheSimplest() throws IOException{
		char [] tabChar = {'l','u','k','a','s'};
		byte[] tabByte = new String(tabChar).getBytes(); //it is not safe and quick way to covert char to byte
		Files.write(file, tabByte, StandardOpenOption.APPEND);
	}
	public void writeListToFileBetterMethod() throws IOException{
		List<String> content = new ArrayList<String>();
		content.add("pierwszy");
		content.add("drugi");
		Files.write(file, content, Charset.defaultCharset(), StandardOpenOption.APPEND);
	}
	

}