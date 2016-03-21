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
		//new Test().simpleReadBytesFromFile();
		//new Test().readLinesFromaFile();
		
	}
	
	// ********** READING **********
	
	//the simplest reading bytes - good for a small files
	// you dobt need to worry about opening and closing stream...
	public void simpleReadBytesFromFile() throws IOException{
		byte[] fileArray;
		fileArray = Files.readAllBytes(file);
		for (int i=0;i<fileArray.length;i++){
			System.out.print((char)fileArray[i]);
		}
	}
	//line by line - good for a small files - better bcos you can set up coding (charset)
	public void readLinesFromaFile() throws IOException{
		List<String> content = Files.readAllLines(file,Charset.defaultCharset());
		
		for(String d:content) {
            System.out.println(d);
		}
	}
		

}