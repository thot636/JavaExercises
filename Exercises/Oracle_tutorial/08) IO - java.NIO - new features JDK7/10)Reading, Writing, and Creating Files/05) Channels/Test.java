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
	
		new Test().readFromFile();
		new Test().wrtieToFile();
		}
	
	public void readFromFile(){
		try (SeekableByteChannel sbc = Files.newByteChannel(file)) {
			ByteBuffer buf = ByteBuffer.allocate(10);

			// Read the bytes with the proper encoding for this platform.  If
			// you skip this step, you might see something that looks like
			// Chinese characters when you expect Latin-style characters.
			String encoding = System.getProperty("file.encoding");
			while (sbc.read(buf) > 0) {
				buf.rewind();
				System.out.print(Charset.forName(encoding).decode(buf));
				buf.flip();
			}
		} catch (IOException x) {
			System.out.println("caught exception: " + x);
		}
	}
		
		public void wrtieToFile(){
			// Create the set of options for appending to the file.
			Set<StandardOpenOption> options = new HashSet<StandardOpenOption>();
			options.add(StandardOpenOption.APPEND);
			options.add(StandardOpenOption.CREATE);

			// Create the custom permissions attribute.
			//Set<PosixFilePermission> perms =
			//	PosixFilePermissions.fromString("rw-r------");
			//FileAttribute<Set<PosixFilePermission>> attr =
			//	PosixFilePermissions.asFileAttribute(perms);

			// Convert the string to a ByteBuffer.
			String s = "Abrkadabra niechaj dzieje sie prawda!!!:) ";
			byte data[] = s.getBytes();
			ByteBuffer bb = ByteBuffer.wrap(data);

			try (SeekableByteChannel sbc = Files.newByteChannel(file, options /*, attr*/)) {
				sbc.write(bb);
			} catch (IOException x) {
				System.out.println("exception thrown: " + x);
			}
		
		}
	
	
}