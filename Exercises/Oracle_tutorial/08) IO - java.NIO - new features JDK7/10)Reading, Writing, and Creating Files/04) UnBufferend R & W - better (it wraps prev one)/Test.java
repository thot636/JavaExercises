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
	
		//new Test().readByUsingnewInputStream();
		//new Test().wrtieOrCreateByUsingnewOutputStream();
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