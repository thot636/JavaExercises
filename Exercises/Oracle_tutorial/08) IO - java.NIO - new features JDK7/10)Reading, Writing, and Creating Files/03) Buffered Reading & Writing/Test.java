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
	
		//new Test().readUsinfNewBufferedReader();
		//new Test().writeUsinfnewBufferedWriter();
		
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
	
}