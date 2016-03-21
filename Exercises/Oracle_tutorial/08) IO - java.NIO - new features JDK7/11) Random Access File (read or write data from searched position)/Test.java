/*
The following code snippet opens a file for both reading and writing by using one of the newByteChannel methods. The SeekableByteChannel that is returned is cast to a FileChannel. Then, 12 bytes are read from the beginning of the file, and the string "I was here!" is written at that location. The current position in the file is moved to the end, and the 12 bytes from the beginning are appended. Finally, the string, "I was here!" is appended, and the channel on the file is closed.
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

class Test{
	private static Path file;
	public static void main (String [] args)throws IOException {
		file = Paths.get("C:\\1\\2\\myFile.txt");
	
		new Test().writeSomewhereToFile();
		
		}
	
	public void writeSomewhereToFile(){
		String s = "I was here!\n";
		byte data[] = s.getBytes();
		ByteBuffer out = ByteBuffer.wrap(data);

		ByteBuffer copy = ByteBuffer.allocate(12);

		try (FileChannel fc = (FileChannel.open(file, StandardOpenOption.READ, StandardOpenOption.WRITE))) {
			// Read the first 12
			// bytes of the file.
			int nread;
			do {
				nread = fc.read(copy);
			} while (nread != -1 && copy.hasRemaining());

			// Write "I was here!" at the beginning of the file.
			fc.position(0);
			while (out.hasRemaining())
				fc.write(out);
			out.rewind();

			// Move to the end of the file.  Copy the first 12 bytes to
			// the end of the file.  Then write "I was here!" again.
			long length = fc.size();
			fc.position(length-1);
			copy.flip();
			while (copy.hasRemaining())
				fc.write(copy);
			while (out.hasRemaining())
				fc.write(out);
		} catch (IOException x) {
			System.out.println("I/O Exception: " + x);
		}
	}
		
		
	
	
}