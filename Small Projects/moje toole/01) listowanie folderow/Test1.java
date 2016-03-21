/*
it will print out all dir and files under specified location 
*/
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.util.concurrent.TimeUnit;
import java.nio.charset.Charset;
import java.util.*;
import java.nio.channels.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.FileVisitResult.*;

class Test1{
	public static void main (String [] args) {
		
		new Test1().listFoldersAndFilesOneLevel();
		
	}
	// it's listing just first level of folders & files under given location 
	// needs to open myFile.txt in notepad++ to be able to  new lines 
	
	public void listFoldersAndFilesOneLevel(){
		Path dir = Paths.get("H:\\Od Daniela 9.08.14\\Filmy i Seriale");
		String s="";
		Path file1 = Paths.get("myFile.txt");
		
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
		
			for (Path file: stream) {	
				System.out.println(file.getFileName()); // to list folders 
				s+=(file.getFileName().toString()+"\n");
			}
			
		} catch (IOException | DirectoryIteratorException x) {
			System.err.println(x);
		}
		try (OutputStream out = new BufferedOutputStream(
						 Files.newOutputStream(file1, StandardOpenOption.TRUNCATE_EXISTING,StandardOpenOption.CREATE))) {
			byte data[] = s.getBytes(); 
			
			out.write(data, 0, data.length);
		} catch (IOException x) {
			System.err.println(x);
		}
	}

}