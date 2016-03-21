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
		//new Test().wrtieBytesToFileTheSimplest();
		//new Test().writeListToFileBetterMethod();
		//new Test().readUsinfNewBufferedReader();
		//new Test().writeUsinfnewBufferedWriter();
		//new Test().readByUsingnewInputStream();
		//new Test().wrtieOrCreateByUsingnewOutputStream();
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
	
	// ****** Buffered I/O Methods for Text Files ******
	
	// ** Reading a File by Using Buffered Stream I/O ** ( newBufferedReader(Path, Charset))
	
	public void readUsinfNewBufferedReader(){
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
	}
	
	// ** Writing a File by Using Buffered Stream I/O ** (  newBufferedWriter )
	
	public void writeUsinfnewBufferedWriter(){
		Charset charset = Charset.forName("US-ASCII");
		String s = "Heeeyy Misssissibpiii:)";
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
			writer.write(s, 0, s.length()); // be care full this overwrite file's content
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
	}
	
	// **** Methods for Unbuffered Streams and Interoperable with java.io APIs ****
	
	// *** Reading a File by Using Stream I/O *** (  newInputStream(Path, OpenOption...)  )
	
	public void readByUsingnewInputStream(){
		try (InputStream in = Files.newInputStream(file);
			BufferedReader reader =
			  new BufferedReader(new InputStreamReader(in))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException x) {
			System.err.println(x);
		}
	}
	
	// ** Creating and Writing a File by Using Stream I/O ** (  newOutputStream(Path, OpenOption...) )
	
	public void wrtieOrCreateByUsingnewOutputStream(){
		String s = "zulugula";
		byte data[] = s.getBytes();

		try (OutputStream out = new BufferedOutputStream(
		// awesome FEATURE it wil lAPPEND if file exist ar create a new file if it dies not exist :)
						 Files.newOutputStream(file, StandardOpenOption.APPEND,StandardOpenOption.CREATE))) {
			//...
			out.write(data, 0, data.length);
		} catch (IOException x) {
			System.err.println(x);
		}
	}
	

}